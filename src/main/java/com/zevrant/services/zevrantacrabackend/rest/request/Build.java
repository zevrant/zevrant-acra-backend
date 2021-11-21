package com.zevrant.services.zevrantacrabackend.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Build {

    @JsonProperty("BOARD")
    private String board = "";
    @JsonProperty("BOOTLOADER")
    private String bootloader = "";
    @JsonProperty("BRAND")
    private String brand = "";
    @JsonProperty("CPU_ABI")
    private String cpuAbi = "";
    @JsonProperty("CPU_ABI2")
    private String cpuAbi2 = "";
    @JsonProperty("DEVICE")
    private String device = "";
    @JsonProperty("DISPLAY")
    private String display = "";
    @JsonProperty("FINGERPRINT")
    private String fingerprint = "";
    @JsonProperty("HARDWARE")
    private String hardware = "";
    @JsonProperty("HOST")
    private String host = "";
    @JsonProperty("ID")
    private String id = "";
    @JsonProperty("IS_DEBUGGABLE")
    private boolean isDebuggable;
    @JsonProperty("IS_EMULATOR")
    private boolean isEmulator;
    @JsonProperty("MANUFACTURER")
    private String manufacturer = "";
    @JsonProperty("MODEL")
    private String model = "";
    @JsonProperty("PERMISSIONS_REVIEW_REQUIRED")
    private boolean permissionsReviewRequired;
    @JsonProperty("PRODUCT")
    private String product = "";
    @JsonProperty("RADIO")
    private String radio = "";
    @JsonProperty("SERIAL")
    private String serial = "";
    @JsonProperty("SUPPORTED_32_BIT_ABIS")
    private List<String> supported32BitAbis;
    @JsonProperty("SUPPORTED_64_BIT_ABIS")
    private List<String> supported64BitAbis;
    @JsonProperty("SUPPORTED_ABIS")
    private List<String> supportedAbis;
    @JsonProperty("TAGS")
    private String tags = "";
    @JsonProperty("TIME")
    private long time;
    @JsonProperty("TYPE")
    private String type = "";
    @JsonProperty("UNKNOWN")
    private String unknown = "";
    @JsonProperty("USER")
    private String user = "";
    @JsonProperty("VERSION")
    private Version version;

    public Build() {
        supported32BitAbis = new ArrayList<>();
        supported64BitAbis = new ArrayList<>();
        supportedAbis = new ArrayList<>();
        version = new Version();
    }

    public String getBoard() {
        return this.board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getBootloader() {
        return this.bootloader;
    }

    public void setBootloader(String bootloader) {
        this.bootloader = bootloader;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpuAbi() {
        return this.cpuAbi;
    }

    public void setCpuAbi(String cpuAbi) {
        this.cpuAbi = cpuAbi;
    }

    public String getCpuAbi2() {
        return this.cpuAbi2;
    }

    public void setCpuAbi2(String cpuAbi2) {
        this.cpuAbi2 = cpuAbi2;
    }

    public String getDevice() {
        return this.device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDisplay() {
        return this.display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getHardware() {
        return this.hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getIsDebuggable() {
        return this.isDebuggable;
    }

    public void setIsDebuggable(boolean isDebuggable) {
        this.isDebuggable = isDebuggable;
    }

    public boolean getIsEmulator() {
        return this.isEmulator;
    }

    public void setIsEmulator(boolean isEmulator) {
        this.isEmulator = isEmulator;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean getPermissionsReviewRequired() {
        return this.permissionsReviewRequired;
    }

    public void setPermissionsReviewRequired(boolean permissionsReviewRequired) {
        this.permissionsReviewRequired = permissionsReviewRequired;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getRadio() {
        return this.radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getSerial() {
        return this.serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public List<String> getSupported_32BitAbis() {
        return this.supported32BitAbis;
    }

    public void setSupported_32BitAbis(List<String> supported_32BitAbis) {
        this.supported32BitAbis = supported_32BitAbis;
    }

    public List<String> getSupported_64BitAbis() {
        return this.supported64BitAbis;
    }

    public void setSupported_64BitAbis(List<String> supported_64BitAbis) {
        this.supported64BitAbis = supported_64BitAbis;
    }

    public List<String> getSupportedAbis() {
        return this.supportedAbis;
    }

    public void setSupportedAbis(List<String> supportedAbis) {
        this.supportedAbis = supportedAbis;
    }

    public String getTags() {
        return this.tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnknown() {
        return this.unknown;
    }

    public void setUnknown(String unknown) {
        this.unknown = unknown;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Version getVersion() {
        return this.version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

}
