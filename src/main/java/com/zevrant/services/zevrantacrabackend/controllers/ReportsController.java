package com.zevrant.services.zevrantacrabackend.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zevrant.services.zevrantacrabackend.entities.Report;
import com.zevrant.services.zevrantacrabackend.rest.request.CrashReport;
import com.zevrant.services.zevrantacrabackend.services.NotificationService;
import com.zevrant.services.zevrantacrabackend.services.ReportsService;
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
//    @PreAuthorize("hasAnyRole('report')")
    public Mono<CrashReport> submitReport(@RequestBody(required = false) CrashReport crashReport) throws JsonProcessingException {
        Report report = reportsService.createReport(crashReport);

        notificationService.sendCrashReport(report);

        return Mono.just(reportsService.convertReport(report));

    }

    @PutMapping
    public CrashReport updateReport(@RequestBody CrashReport crashReport) {
        return reportsService.convertReport(reportsService.updateReport(crashReport));
    }

}
