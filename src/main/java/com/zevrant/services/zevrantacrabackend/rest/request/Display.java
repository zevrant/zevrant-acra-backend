package com.zevrant.services.zevrantacrabackend.rest.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Display {

    @JsonProperty("0")
    @JsonIgnore
    private Object display0;

    public Display() {

    }

    public Object get0() {
        return this.display0;
    }

    public void set0(Object display0) {
        this.display0 = display0;
    }

}
