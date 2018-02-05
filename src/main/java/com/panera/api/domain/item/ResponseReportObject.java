package com.panera.api.domain.item;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashMap;
import java.util.Map;

public class ResponseReportObject {


    @JsonIgnore
    private Map<String, String> additionalProperties =
            new HashMap<String, String>();


    @JsonAnyGetter
    public Map<String, String> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, String value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "ResponseReportObject{" +
                "additionalProperties=" + additionalProperties +
                '}';
    }
}