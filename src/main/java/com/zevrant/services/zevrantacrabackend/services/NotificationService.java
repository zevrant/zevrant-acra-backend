package com.zevrant.services.zevrantacrabackend.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.zevrant.services.zevrantacrabackend.entities.Report;
import com.zevrant.services.zevrantacrabackend.rest.request.Notification;
import com.zevrant.services.zevrantacrabackend.rest.response.AccessToken;
import io.micrometer.core.instrument.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class NotificationService {

    private static final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    private final RestTemplate restTemplate;
    private final String notificationAddress;
    private final String oauthUrl;
    private final String clientId;
    private final String clientSecret;
    private final ObjectWriter objectWriter;
    private final String environment;

    @Autowired
    public NotificationService(RestTemplate restTemplate,
                               @Value("${zevrant.services.notification}") String notificationAddress,
                               @Value("${spring.security.oauth2.client.provider.keycloak.issuer-uri}") String oauthUrl,
                               @Value("${acra.oauth.clientId}") String clientId,
                               @Value("${acra.oauth.clientSecret}") String clientSecret,
                               @Value("${spring.profiles.active}") String[] profiles) {
        this.restTemplate = restTemplate;
        this.notificationAddress = notificationAddress;
        this.oauthUrl = oauthUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.objectWriter = new ObjectMapper().writerWithDefaultPrettyPrinter();
        this.environment = (Arrays.stream(profiles)
                .filter(profile -> profile.equals("local") || profile.equals("develop") || profile.equals("prod"))
                .findFirst().orElseThrow(() -> new RuntimeException("Unable to determine runtime environment")));
    }

    public void sendCrashReport(Report report) {
        try {
            Notification notification = new Notification();

            String subject = new StringBuilder("Crash Report for App Version ")
                    .append(report.getAppVersionName())
                    .append(" in the ")
                    .append(environment)
                    .append(" environment with Android Version ")
                    .append(report.getAndroidVersion())
                    .toString();
            notification.setSubject(subject);

            MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            body.set("client_id", this.clientId);
            body.set("client_secret", this.clientSecret);
            body.set("grant_type", "client_credentials");
            HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body, headers);

            ResponseEntity<AccessToken> response = restTemplate.exchange(this.oauthUrl + "/protocol/openid-connect/token" ,
                    HttpMethod.POST, entity, AccessToken.class);

            assert response.hasBody();
            assert StringUtils.isNotBlank(response.getBody().getAccessToken());
            headers = new HttpHeaders();
            headers.set("NOTIFICATION_TYPE", "EMAIL");
            headers.setBearerAuth(response.getBody().getAccessToken());
            headers.set("Authorization", "bearer ".concat(response.getBody().getAccessToken()));
            headers.setContentType(MediaType.APPLICATION_JSON);
            notification.setBody(objectWriter.writeValueAsString(report));
            HttpEntity<String> entity2 = new HttpEntity<>(objectWriter.writeValueAsString(notification), headers);
            restTemplate.exchange(notificationAddress.concat("/notifications"), HttpMethod.POST,
                    entity2, String.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            logger.error("Failed to write notification to string");
        }
    }
}
