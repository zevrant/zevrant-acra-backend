package com.zevrant.services.zevrantacrabackend.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildConfig {

    @JsonProperty("APPLICATION_ID")
    private String applicationId = "";
    @JsonProperty("BUILD_TYPE")
    private String buildType = "";
    @JsonProperty("DEBUG")
    private boolean debug;
    @JsonProperty("TEST_SCENARIO")
    private String testScenario = "";
    @JsonProperty("TEST_TAGS")
    private String testTags = "";
    @JsonProperty("VERSION_CODE")
    private int versionCode;
    @JsonProperty("VERSION_NAME")
    private String versionName = "";

    public BuildConfig() {

    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getBuildType() {
        return this.buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public boolean getDebug() {
        return this.debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public String getTestScenario() {
        return this.testScenario;
    }

    public void setTestScenario(String testScenario) {
        this.testScenario = testScenario;
    }

    public String getTestTags() {
        return this.testTags;
    }

    public void setTestTags(String testTags) {
        this.testTags = testTags;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

}
