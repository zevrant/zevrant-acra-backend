package com.zevrant.services.zevrantacrabackend.rest.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CrashReport {

    @JsonProperty("REPORT_ID")
    private String reportId;
    @JsonProperty("APP_VERSION_CODE")
    private int appVersionCode;
    @JsonProperty("APP_VERSION_NAME")
    private String appVersionName;
    @JsonProperty("PACKAGE_NAME")
    private String packageName;
    @JsonProperty("FILE_PATH")
    private String filePath;
    @JsonProperty("PHONE_MODEL")
    private String phoneModel;
    @JsonProperty("BRAND")
    private String brand;
    @JsonProperty("PRODUCT")
    private String product;
    @JsonProperty("ANDROID_VERSION")
    private int androidVersion;
    @JsonProperty("BUILD")
    private Build build;
    @JsonProperty("TOTAL_MEM_SIZE")
    private long totalMemSize;
    @JsonProperty("AVAILABLE_MEM_SIZE")
    private long availableMemSize;
    @JsonProperty("BUILD_CONFIG")
    private BuildConfig buildConfig;
    @JsonProperty("CUSTOM_DATA")
    private CustomData customData;
    @JsonProperty("IS_SILENT")
    private boolean isSilent;
    @JsonProperty("STACK_TRACE")
    private String stackTrace;
    @JsonProperty("INITIAL_CONFIGURATION")
    private InitialConfiguration initialConfiguration;
    @JsonProperty("CRASH_CONFIGURATION")
    private CrashConfiguration crashConfiguration;
    @JsonProperty("DISPLAY")
    @JsonIgnore
    private Display display;
    @JsonProperty("USER_COMMENT")
    private String userComment;
    @JsonProperty("USER_EMAIL")
    private String userEmail;
    @JsonProperty("USER_APP_START_DATE")
    private String userAppStartDate;
    @JsonProperty("USER_CRASH_DATE")
    private String userCrashDate;
    @JsonProperty("DUMPSYS_MEMINFO")
    private String dumpsysMeminfo;
    @JsonProperty("LOGCAT")
    private String logcat;
    @JsonProperty("INSTALLATION_ID")
    private String installationId;
    @JsonProperty("DEVICE_FEATURES")
    private Map<String, Object> deviceFeatures;
    @JsonProperty("ENVIRONMENT")
    private Environment environment;
    @JsonProperty("SHARED_PREFERENCES")
    private SharedPreferences sharedPreferences;
    @JsonProperty("IS_RESOLVED")
    private Environment isResolved;
    @JsonProperty("RESOLVED_VERSION")
    private String resolvedVersion;


    public CrashReport() {
        build = new Build();
        buildConfig = new BuildConfig();
        crashConfiguration = new CrashConfiguration();
        customData = new CustomData();
        display = new Display();
        environment = new Environment();
        initialConfiguration = new InitialConfiguration();
        sharedPreferences = new SharedPreferences();
        deviceFeatures = new HashMap<>();
    }

    public String getReportId() {
        return this.reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public int getAppVersionCode() {
        return this.appVersionCode;
    }

    public void setAppVersionCode(int appVersionCode) {
        this.appVersionCode = appVersionCode;
    }

    public String getAppVersionName() {
        return this.appVersionName;
    }

    public void setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getPhoneModel() {
        return this.phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getAndroidVersion() {
        return this.androidVersion;
    }

    public void setAndroidVersion(int androidVersion) {
        this.androidVersion = androidVersion;
    }

    public Build getBuild() {
        return this.build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public long getTotalMemSize() {
        return this.totalMemSize;
    }

    public void setTotalMemSize(long totalMemSize) {
        this.totalMemSize = totalMemSize;
    }

    public long getAvailableMemSize() {
        return this.availableMemSize;
    }

    public void setAvailableMemSize(long availableMemSize) {
        this.availableMemSize = availableMemSize;
    }

    public BuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    public void setBuildConfig(BuildConfig buildConfig) {
        this.buildConfig = buildConfig;
    }

    public CustomData getCustomData() {
        return this.customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    public boolean getIsSilent() {
        return this.isSilent;
    }

    public void setIsSilent(boolean isSilent) {
        this.isSilent = isSilent;
    }

    public String getStackTrace() {
        return this.stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public InitialConfiguration getInitialConfiguration() {
        return this.initialConfiguration;
    }

    public void setInitialConfiguration(InitialConfiguration initialConfiguration) {
        this.initialConfiguration = initialConfiguration;
    }

    public CrashConfiguration getCrashConfiguration() {
        return this.crashConfiguration;
    }

    public void setCrashConfiguration(CrashConfiguration crashConfiguration) {
        this.crashConfiguration = crashConfiguration;
    }

    public Display getDisplay() {
        return this.display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getUserComment() {
        return this.userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAppStartDate() {
        return this.userAppStartDate;
    }

    public void setUserAppStartDate(String userAppStartDate) {
        this.userAppStartDate = userAppStartDate;
    }

    public String getUserCrashDate() {
        return this.userCrashDate;
    }

    public void setUserCrashDate(String userCrashDate) {
        this.userCrashDate = userCrashDate;
    }

    public String getDumpsysMeminfo() {
        return this.dumpsysMeminfo;
    }

    public void setDumpsysMeminfo(String dumpsysMeminfo) {
        this.dumpsysMeminfo = dumpsysMeminfo;
    }

    public String getLogcat() {
        return this.logcat;
    }

    public void setLogcat(String logcat) {
        this.logcat = logcat;
    }

    public String getInstallationId() {
        return this.installationId;
    }

    public void setInstallationId(String installationId) {
        this.installationId = installationId;
    }

    public Map<String, Object> getDeviceFeatures() {
        return this.deviceFeatures;
    }

    public void setDeviceFeatures(Map<String, Object> deviceFeatures) {
        this.deviceFeatures = deviceFeatures;
    }

    public Environment getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public void setSharedPreferences(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public boolean isSilent() {
        return isSilent;
    }

    public void setSilent(boolean silent) {
        isSilent = silent;
    }

    public Environment getIsResolved() {
        return isResolved;
    }

    public void setIsResolved(Environment isResolved) {
        this.isResolved = isResolved;
    }

    public String getResolvedVersion() {
        return resolvedVersion;
    }

    public void setResolvedVersion(String resolvedVersion) {
        this.resolvedVersion = resolvedVersion;
    }
}
