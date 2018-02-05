package com.panera.api.domain.item;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

public class ResponseObject {


    private ArrayList<String> metaDataList;

    @JsonCreator
    public ResponseObject(@JsonProperty("metaDAtaList") ArrayList<String> metaDataList) {
        this.metaDataList = metaDataList;
    }


    public ArrayList<String> getMetaDataList() {
        return metaDataList;
    }

    public void setMetaDataList(ArrayList<String> metaDataList) {
        this.metaDataList = metaDataList;
    }
}