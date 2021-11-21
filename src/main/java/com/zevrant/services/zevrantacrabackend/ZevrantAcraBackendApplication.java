package com.zevrant.services.zevrantacrabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.zevrant.services"})
public class ZevrantAcraBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZevrantAcraBackendApplication.class, args);
    }

}
