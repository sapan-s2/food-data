package com.panera.api.domain.item;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

public class MyObject {

//    @JsonIgnore
    private String queryId;

    @JsonIgnore
    private Map<String, Boolean> additionalProperties =
            new HashMap<String, Boolean>();

//    @JsonCreator
//    public MyObject(@JsonProperty("queryId") int queryId, @JsonProperty("additionalProperties") Map<String, Boolean> additionalProperties) {
//        this.queryId = queryId;
//        this.additionalProperties = additionalProperties;
//    }

//    @JsonAnyGetter
    public String getQueryId() {
        return queryId;
    }

//    @JsonAnySetter
    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    @JsonAnyGetter
    public Map<String, Boolean> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Boolean value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "queryId=" + queryId +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}