package com.zevrant.services.zevrantacrabackend.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class SharedPreferences {

    @JsonProperty("default")
    private Map<String, Object> defaultVar;

    public SharedPreferences() {

    }

    public Map<String, Object> getDefault() {
        return this.defaultVar;
    }

    public void setDefault(Map<String, Object> defaultVar) {
        this.defaultVar = defaultVar;
    }

}
