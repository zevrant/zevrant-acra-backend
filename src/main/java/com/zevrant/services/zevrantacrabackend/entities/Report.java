package com.zevrant.services.zevrantacrabackend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "REPORT")
@Entity
public class Report {

    @Id
    @Column(name = "report_id")
    private UUID reportId;
    @Column(name = "app_version_code")
    private int appVersionCode;
    @Column(name = "app_version_name")
    private String appVersionName;
    @Column(name = "package_name")
    private String packageName;
    @Column(name = "file_path")
    private String filePath;
    @Column(name = "phone_model")
    private String phoneModel;
    @Column(name = "brand")
    private String brand;
    @Column(name = "product")
    private String product;
    @Column(name = "android_version")
    private int androidVersion;
//    @Column(name = "BUILD")
//    private Build build;
    @Column(name = "total_mem_size")
    private long totalMemSize;
    @Column(name = "available_mem_size")
    private long availableMemSize;
//    @Column(name = "BUILD_CONFIG")
//    private BuildConfig buildConfig;
//    @Column(name = "CUSTOM_DATA")
//    private CustomData customData;
    @Column(name = "is_silent")
    private boolean isSilent;
    @Column(name = "stack_trace")
    private String stackTrace;
//    @Column(name = "INITIAL_CONFIGURATION")
//    private InitialConfiguration initialConfiguration;
//    @Column(name = "CRASH_CONFIGURATION")
//    private CrashConfiguration crashConfiguration;
//    @Column(name = "DISPLAY")
//    @JsonIgnore
//    private Display display;
    @Column(name = "user_comment")
    private String userComment;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "user_app_start_date")
    private String userAppStartDate;
    @Column(name = "user_crash_date")
    private String userCrashDate;
    @Column(name = "dumpsys_mem_info")
    private String dumpsysMeminfo;
    @Column(name = "logcat")
    private String logcat;
    @Column(name = "installation_id")
    private String installationId;
//    @Column(name = "DEVICE_FEATURES")
//    private Map<String, Object> deviceFeatures;
//    @Column(name = "ENVIRONMENT")
//    private Environment environment;
//    @Column(name = "SHARED_PREFERENCES")
//    private SharedPreferences sharedPreferences;
    @Column(name = "is_resolved")
    private boolean isResolved;
    @Column(name = "resolved_version")
    private String resolvedVersion;

    public Report() {
        this.isResolved = false;
    }

    public UUID getUuid() {
        return reportId;
    }

    public void setUuid(UUID reportId) {
        this.reportId = reportId;
    }

    public UUID getReportId() {
        return reportId;
    }

    public void setReportId(UUID reportId) {
        this.reportId = reportId;
    }

    public int getAppVersionCode() {
        return appVersionCode;
    }

    public void setAppVersionCode(int appVersionCode) {
        this.appVersionCode = appVersionCode;
    }

    public String getAppVersionName() {
        return appVersionName;
    }

    public void setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(int androidVersion) {
        this.androidVersion = androidVersion;
    }

    public long getTotalMemSize() {
        return totalMemSize;
    }

    public void setTotalMemSize(long totalMemSize) {
        this.totalMemSize = totalMemSize;
    }

    public long getAvailableMemSize() {
        return availableMemSize;
    }

    public void setAvailableMemSize(long availableMemSize) {
        this.availableMemSize = availableMemSize;
    }

    public boolean isSilent() {
        return isSilent;
    }

    public void setSilent(boolean silent) {
        isSilent = silent;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAppStartDate() {
        return userAppStartDate;
    }

    public void setUserAppStartDate(String userAppStartDate) {
        this.userAppStartDate = userAppStartDate;
    }

    public String getUserCrashDate() {
        return userCrashDate;
    }

    public void setUserCrashDate(String userCrashDate) {
        this.userCrashDate = userCrashDate;
    }

    public String getDumpsysMeminfo() {
        return dumpsysMeminfo;
    }

    public void setDumpsysMeminfo(String dumpsysMeminfo) {
        this.dumpsysMeminfo = dumpsysMeminfo;
    }

    public String getLogcat() {
        return logcat;
    }

    public void setLogcat(String logcat) {
        this.logcat = logcat;
    }

    public String getInstallationId() {
        return installationId;
    }

    public void setInstallationId(String installationId) {
        this.installationId = installationId;
    }

    public boolean isResolved() {
        return isResolved;
    }

    public void setResolved(boolean resolved) {
        isResolved = resolved;
    }

    public String getResolvedVersion() {
        return resolvedVersion;
    }

    public void setResolvedVersion(String resolvedVersion) {
        this.resolvedVersion = resolvedVersion;
    }
}
