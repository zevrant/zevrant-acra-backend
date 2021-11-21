package com.zevrant.services.zevrantacrabackend.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InitialConfiguration {

    @JsonProperty("assetsSeq")
    private int assetsseq;
    @JsonProperty("colorMode")
    private int colormode;
    @JsonProperty("densityDpi")
    private int densitydpi;
    @JsonProperty("fontScale")
    private int fontscale;
    @JsonProperty("hardKeyboardHidden")
    private String hardkeyboardhidden;
    @JsonProperty("keyboard")
    private String keyboard;
    @JsonProperty("keyboardHidden")
    private String keyboardhidden;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("mcc")
    private int mcc;
    @JsonProperty("mnc")
    private int mnc;
    @JsonProperty("navigation")
    private String navigation;
    @JsonProperty("navigationHidden")
    private String navigationhidden;
    @JsonProperty("orientation")
    private String orientation;
    @JsonProperty("screenHeightDp")
    private int screenheightdp;
    @JsonProperty("screenLayout")
    private String screenlayout;
    @JsonProperty("screenWidthDp")
    private int screenwidthdp;
    @JsonProperty("seq")
    private int seq;
    @JsonProperty("smallestScreenWidthDp")
    private int smallestscreenwidthdp;
    @JsonProperty("touchscreen")
    private String touchscreen;
    @JsonProperty("uiMode")
    private String uimode;
    @JsonProperty("userSetLocale")
    private boolean usersetlocale;

    public InitialConfiguration() {

    }

    public int getAssetsseq() {
        return this.assetsseq;
    }

    public void setAssetsseq(int assetsseq) {
        this.assetsseq = assetsseq;
    }

    public int getColormode() {
        return this.colormode;
    }

    public void setColormode(int colormode) {
        this.colormode = colormode;
    }

    public int getDensitydpi() {
        return this.densitydpi;
    }

    public void setDensitydpi(int densitydpi) {
        this.densitydpi = densitydpi;
    }

    public int getFontscale() {
        return this.fontscale;
    }

    public void setFontscale(int fontscale) {
        this.fontscale = fontscale;
    }

    public String getHardkeyboardhidden() {
        return this.hardkeyboardhidden;
    }

    public void setHardkeyboardhidden(String hardkeyboardhidden) {
        this.hardkeyboardhidden = hardkeyboardhidden;
    }

    public String getKeyboard() {
        return this.keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getKeyboardhidden() {
        return this.keyboardhidden;
    }

    public void setKeyboardhidden(String keyboardhidden) {
        this.keyboardhidden = keyboardhidden;
    }

    public String getLocale() {
        return this.locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public int getMcc() {
        return this.mcc;
    }

    public void setMcc(int mcc) {
        this.mcc = mcc;
    }

    public int getMnc() {
        return this.mnc;
    }

    public void setMnc(int mnc) {
        this.mnc = mnc;
    }

    public String getNavigation() {
        return this.navigation;
    }

    public void setNavigation(String navigation) {
        this.navigation = navigation;
    }

    public String getNavigationhidden() {
        return this.navigationhidden;
    }

    public void setNavigationhidden(String navigationhidden) {
        this.navigationhidden = navigationhidden;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public int getScreenheightdp() {
        return this.screenheightdp;
    }

    public void setScreenheightdp(int screenheightdp) {
        this.screenheightdp = screenheightdp;
    }

    public String getScreenlayout() {
        return this.screenlayout;
    }

    public void setScreenlayout(String screenlayout) {
        this.screenlayout = screenlayout;
    }

    public int getScreenwidthdp() {
        return this.screenwidthdp;
    }

    public void setScreenwidthdp(int screenwidthdp) {
        this.screenwidthdp = screenwidthdp;
    }

    public int getSeq() {
        return this.seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getSmallestscreenwidthdp() {
        return this.smallestscreenwidthdp;
    }

    public void setSmallestscreenwidthdp(int smallestscreenwidthdp) {
        this.smallestscreenwidthdp = smallestscreenwidthdp;
    }

    public String getTouchscreen() {
        return this.touchscreen;
    }

    public void setTouchscreen(String touchscreen) {
        this.touchscreen = touchscreen;
    }

    public String getUimode() {
        return this.uimode;
    }

    public void setUimode(String uimode) {
        this.uimode = uimode;
    }

    public boolean getUsersetlocale() {
        return this.usersetlocale;
    }

    public void setUsersetlocale(boolean usersetlocale) {
        this.usersetlocale = usersetlocale;
    }

}
