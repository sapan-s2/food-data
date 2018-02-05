package com.panera.api.domain.item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;

@Entity
public class FilterDataObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private ArrayList<String> metaDataList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<String> getMetaDataList() {
        return metaDataList;
    }

    public void setMetaDataList(ArrayList<String> metaDataList) {
        this.metaDataList = metaDataList;
    }
}