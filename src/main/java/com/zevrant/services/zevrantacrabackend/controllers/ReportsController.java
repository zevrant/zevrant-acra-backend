package com.zevrant.services.zevrantacrabackend.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zevrant.services.zevrantacrabackend.entities.Report;
import com.zevrant.services.zevrantacrabackend.services.NotificationService;
import com.zevrant.services.zevrantacrabackend.services.ReportsService;
import com.zevrant.services.zevrantuniversalcommon.rest.acra.request.CrashReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/reports")
public class ReportsController {

    private static final Logger logger = LoggerFactory.getLogger(ReportsController.class);

    private final ReportsService reportsService;
    private final NotificationService notificationService;

    @Autowired
    public ReportsController(ReportsService reportsService, NotificationService notificationService) {
        this.reportsService = reportsService;
        this.notificationService = notificationService;
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('reports')")
    public Mono<CrashReport> submitReport(@RequestBody(required = false) CrashReport crashReport) throws JsonProcessingException {
        Report report = reportsService.createReport(crashReport);

        notificationService.sendCrashReport(report);

        return Mono.just(reportsService.convertReport(report));

    }

    @PutMapping
    @PreAuthorize("hasAnyRole('reports')")
    public Mono<CrashReport> updateReport(@RequestBody CrashReport crashReport) {
        return Mono.just(reportsService.convertReport(reportsService.updateReport(crashReport)));
    }

}
