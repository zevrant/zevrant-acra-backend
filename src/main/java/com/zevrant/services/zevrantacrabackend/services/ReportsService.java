package com.zevrant.services.zevrantacrabackend.services;

import com.zevrant.services.zevrantacrabackend.entities.Report;
import com.zevrant.services.zevrantacrabackend.exceptions.ReportNotFoundException;
import com.zevrant.services.zevrantacrabackend.repositories.ReportsRepository;
import com.zevrant.services.zevrantuniversalcommon.rest.acra.request.CrashReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ReportsService {

    private ReportsRepository reportsRepository;

    @Autowired
    public ReportsService(ReportsRepository reportsRepository) {
        this.reportsRepository = reportsRepository;
    }

    public Report createReport(CrashReport crashReport) {
        Report report = convertCrashReport(crashReport);
        Optional<Report> reportProxy = reportsRepository.findById(report.getReportId());
        if(reportProxy.isPresent()) {
//            throw new ReportExistsException("Report " + report.getReportId().toString() + "already exists");
            reportsRepository.delete(reportProxy.get());
        }
        return reportsRepository.save(report);
    }

    public Report updateReport(CrashReport crashReport) {
        Report report = convertCrashReport(crashReport);
        Optional<Report> reportProxy = reportsRepository.findById(report.getReportId());
        if(reportProxy.isPresent()){
            throw new ReportNotFoundException("Report with id " + report.getReportId().toString() + " not found.");
        }
        return reportsRepository.save(report);
    }

    public Report convertCrashReport(CrashReport crashReport) {
        Report report = new Report();
        report.setReportId(UUID.fromString(crashReport.getReportId()));
        report.setAppVersionCode(crashReport.getAppVersionCode());
        report.setAppVersionName(crashReport.getAppVersionName());
        report.setPackageName(crashReport.getPackageName());
        report.setFilePath(crashReport.getFilePath());
        report.setPhoneModel(crashReport.getPhoneModel());
        report.setBrand(crashReport.getBrand());
        report.setProduct(crashReport.getProduct());
        report.setAndroidVersion(crashReport.getAndroidVersion());
        report.setTotalMemSize(crashReport.getTotalMemSize());
        report.setAvailableMemSize(crashReport.getAvailableMemSize());
        report.setSilent(crashReport.getIsSilent());
        report.setStackTrace(crashReport.getStackTrace());
        report.setUserEmail(crashReport.getUserEmail());
        report.setUserAppStartDate(crashReport.getUserAppStartDate());
        report.setUserCrashDate(crashReport.getUserCrashDate());
        report.setDumpsysMeminfo(crashReport.getDumpsysMeminfo());
        report.setLogcat(crashReport.getLogcat());
        report.setInstallationId(crashReport.getInstallationId());
        return report;
    }

    public CrashReport convertReport(Report report) {
        CrashReport crashReport = new CrashReport();
        crashReport.setReportId(report.getReportId().toString());
        crashReport.setAppVersionCode(report.getAppVersionCode());
        crashReport.setAppVersionName(report.getAppVersionName());
        crashReport.setPackageName(report.getPackageName());
        crashReport.setFilePath(report.getFilePath());
        crashReport.setPhoneModel(report.getPhoneModel());
        crashReport.setBrand(report.getBrand());
        crashReport.setProduct(report.getProduct());
        crashReport.setAndroidVersion(report.getAndroidVersion());
        crashReport.setTotalMemSize(report.getTotalMemSize());
        crashReport.setAvailableMemSize(report.getAvailableMemSize());
        crashReport.setIsSilent(report.isSilent());
        crashReport.setStackTrace(report.getStackTrace());
        crashReport.setUserEmail(report.getUserEmail());
        crashReport.setUserAppStartDate(report.getUserEmail());
        crashReport.setUserCrashDate(report.getUserCrashDate());
        crashReport.setDumpsysMeminfo(report.getDumpsysMeminfo());
        crashReport.setInstallationId(report.getInstallationId());
        return crashReport;
    }
}
