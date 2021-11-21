package com.zevrant.services.zevrantacrabackend.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Version {

    @JsonProperty("ACTIVE_CODENAMES")
    private List<String> activeCodenames;
    @JsonProperty("BASE_OS")
    private String baseOs = "";
    @JsonProperty("CODENAME")
    private String codename = "";
    @JsonProperty("INCREMENTAL")
    private int incremental;
    @JsonProperty("PREVIEW_SDK_FINGERPRINT")
    private String previewSdkFingerprint = "";
    @JsonProperty("PREVIEW_SDK_INT")
    private int previewSdkInt;
    @JsonProperty("RELEASE")
    private int release;
    @JsonProperty("RELEASE_OR_CODENAME")
    private int releaseOrCodename;
    @JsonProperty("SDK")
    private int sdk;
    @JsonProperty("SDK_INT")
    private int sdkInt;
    @JsonProperty("SECURITY_PATCH")
    private String securityPatch = "";

    public Version() {
        activeCodenames = new ArrayList<>();
    }

    public List<String> getActiveCodenames() {
        return this.activeCodenames;
    }

    public void setActiveCodenames(List<String> activeCodenames) {
        this.activeCodenames = activeCodenames;
    }

    public String getBaseOs() {
        return this.baseOs;
    }

    public void setBaseOs(String baseOs) {
        this.baseOs = baseOs;
    }

    public String getCodename() {
        return this.codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public int getIncremental() {
        return this.incremental;
    }

    public void setIncremental(int incremental) {
        this.incremental = incremental;
    }

    public String getPreviewSdkFingerprint() {
        return this.previewSdkFingerprint;
    }

    public void setPreviewSdkFingerprint(String previewSdkFingerprint) {
        this.previewSdkFingerprint = previewSdkFingerprint;
    }

    public int getPreviewSdkInt() {
        return this.previewSdkInt;
    }

    public void setPreviewSdkInt(int previewSdkInt) {
        this.previewSdkInt = previewSdkInt;
    }

    public int getRelease() {
        return this.release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public int getReleaseOrCodename() {
        return this.releaseOrCodename;
    }

    public void setReleaseOrCodename(int releaseOrCodename) {
        this.releaseOrCodename = releaseOrCodename;
    }

    public int getSdk() {
        return this.sdk;
    }

    public void setSdk(int sdk) {
        this.sdk = sdk;
    }

    public int getSdkInt() {
        return this.sdkInt;
    }

    public void setSdkInt(int sdkInt) {
        this.sdkInt = sdkInt;
    }

    public String getSecurityPatch() {
        return this.securityPatch;
    }

    public void setSecurityPatch(String securityPatch) {
        this.securityPatch = securityPatch;
    }

}
