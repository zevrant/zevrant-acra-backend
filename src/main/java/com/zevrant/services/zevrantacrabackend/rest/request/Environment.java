package com.zevrant.services.zevrantacrabackend.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Environment {

    @JsonProperty("getDataDirectory")
    private String getdatadirectory;
    @JsonProperty("getDataSystemDirectory")
    private String getdatasystemdirectory;
    @JsonProperty("getDownloadCacheDirectory")
    private String getdownloadcachedirectory;
    @JsonProperty("getExternalStorageDirectory")
    private String getexternalstoragedirectory;
    @JsonProperty("getExternalStorageState")
    private String getexternalstoragestate;
    @JsonProperty("getInternalMediaDirectories")
    private String getinternalmediadirectories;
    @JsonProperty("getLegacyExternalStorageDirectory")
    private String getlegacyexternalstoragedirectory;
    @JsonProperty("getLegacyExternalStorageObbDirectory")
    private String getlegacyexternalstorageobbdirectory;
    @JsonProperty("getOdmDirectory")
    private String getodmdirectory;
    @JsonProperty("getOemDirectory")
    private String getoemdirectory;
    @JsonProperty("getProductDirectory")
    private String getproductdirectory;
    @JsonProperty("getProductServicesDirectory")
    private String getproductservicesdirectory;
    @JsonProperty("getRootDirectory")
    private String getrootdirectory;
    @JsonProperty("getStorageDirectory")
    private String getstoragedirectory;
    @JsonProperty("getSystemExtDirectory")
    private String getsystemextdirectory;
    @JsonProperty("getVendorDirectory")
    private String getvendordirectory;
    @JsonProperty("isExternalStorageEmulated")
    private boolean isexternalstorageemulated;
    @JsonProperty("isExternalStorageLegacy")
    private boolean isexternalstoragelegacy;
    @JsonProperty("isExternalStorageManager")
    private boolean isexternalstoragemanager;
    @JsonProperty("isExternalStorageRemovable")
    private boolean isexternalstorageremovable;

    public Environment() {

    }

    public String getGetdatadirectory() {
        return this.getdatadirectory;
    }

    public void setGetdatadirectory(String getdatadirectory) {
        this.getdatadirectory = getdatadirectory;
    }

    public String getGetdatasystemdirectory() {
        return this.getdatasystemdirectory;
    }

    public void setGetdatasystemdirectory(String getdatasystemdirectory) {
        this.getdatasystemdirectory = getdatasystemdirectory;
    }

    public String getGetdownloadcachedirectory() {
        return this.getdownloadcachedirectory;
    }

    public void setGetdownloadcachedirectory(String getdownloadcachedirectory) {
        this.getdownloadcachedirectory = getdownloadcachedirectory;
    }

    public String getGetexternalstoragedirectory() {
        return this.getexternalstoragedirectory;
    }

    public void setGetexternalstoragedirectory(String getexternalstoragedirectory) {
        this.getexternalstoragedirectory = getexternalstoragedirectory;
    }

    public String getGetexternalstoragestate() {
        return this.getexternalstoragestate;
    }

    public void setGetexternalstoragestate(String getexternalstoragestate) {
        this.getexternalstoragestate = getexternalstoragestate;
    }

    public String getGetinternalmediadirectories() {
        return this.getinternalmediadirectories;
    }

    public void setGetinternalmediadirectories(String getinternalmediadirectories) {
        this.getinternalmediadirectories = getinternalmediadirectories;
    }

    public String getGetlegacyexternalstoragedirectory() {
        return this.getlegacyexternalstoragedirectory;
    }

    public void setGetlegacyexternalstoragedirectory(String getlegacyexternalstoragedirectory) {
        this.getlegacyexternalstoragedirectory = getlegacyexternalstoragedirectory;
    }

    public String getGetlegacyexternalstorageobbdirectory() {
        return this.getlegacyexternalstorageobbdirectory;
    }

    public void setGetlegacyexternalstorageobbdirectory(String getlegacyexternalstorageobbdirectory) {
        this.getlegacyexternalstorageobbdirectory = getlegacyexternalstorageobbdirectory;
    }

    public String getGetodmdirectory() {
        return this.getodmdirectory;
    }

    public void setGetodmdirectory(String getodmdirectory) {
        this.getodmdirectory = getodmdirectory;
    }

    public String getGetoemdirectory() {
        return this.getoemdirectory;
    }

    public void setGetoemdirectory(String getoemdirectory) {
        this.getoemdirectory = getoemdirectory;
    }

    public String getGetproductdirectory() {
        return this.getproductdirectory;
    }

    public void setGetproductdirectory(String getproductdirectory) {
        this.getproductdirectory = getproductdirectory;
    }

    public String getGetproductservicesdirectory() {
        return this.getproductservicesdirectory;
    }

    public void setGetproductservicesdirectory(String getproductservicesdirectory) {
        this.getproductservicesdirectory = getproductservicesdirectory;
    }

    public String getGetrootdirectory() {
        return this.getrootdirectory;
    }

    public void setGetrootdirectory(String getrootdirectory) {
        this.getrootdirectory = getrootdirectory;
    }

    public String getGetstoragedirectory() {
        return this.getstoragedirectory;
    }

    public void setGetstoragedirectory(String getstoragedirectory) {
        this.getstoragedirectory = getstoragedirectory;
    }

    public String getGetsystemextdirectory() {
        return this.getsystemextdirectory;
    }

    public void setGetsystemextdirectory(String getsystemextdirectory) {
        this.getsystemextdirectory = getsystemextdirectory;
    }

    public String getGetvendordirectory() {
        return this.getvendordirectory;
    }

    public void setGetvendordirectory(String getvendordirectory) {
        this.getvendordirectory = getvendordirectory;
    }

    public boolean getIsexternalstorageemulated() {
        return this.isexternalstorageemulated;
    }

    public void setIsexternalstorageemulated(boolean isexternalstorageemulated) {
        this.isexternalstorageemulated = isexternalstorageemulated;
    }

    public boolean getIsexternalstoragelegacy() {
        return this.isexternalstoragelegacy;
    }

    public void setIsexternalstoragelegacy(boolean isexternalstoragelegacy) {
        this.isexternalstoragelegacy = isexternalstoragelegacy;
    }

    public boolean getIsexternalstoragemanager() {
        return this.isexternalstoragemanager;
    }

    public void setIsexternalstoragemanager(boolean isexternalstoragemanager) {
        this.isexternalstoragemanager = isexternalstoragemanager;
    }

    public boolean getIsexternalstorageremovable() {
        return this.isexternalstorageremovable;
    }

    public void setIsexternalstorageremovable(boolean isexternalstorageremovable) {
        this.isexternalstorageremovable = isexternalstorageremovable;
    }

}
