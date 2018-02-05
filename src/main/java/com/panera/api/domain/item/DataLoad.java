package com.panera.api.domain.item;

import java.time.LocalTime;

/**
 * Created by sjain on 2/1/18.
 */
public class DataLoad {

    private final String loadId;
    private final String batchId;
    private final String insertDate;
    private final String lastUpdatedDate;
    private final String version;

    public DataLoad(String loadId, String batchId, String insertDate, String lastUpdatedDate, String version) {
        this.loadId = loadId;
        this.batchId = batchId;
        this.insertDate = insertDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.version = version;
    }

    public String getLoadId() {
        return loadId;
    }

    public String getBatchId() {
        return batchId;
    }

    public String getInsertDate() {
        return insertDate;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "DataLoad{" +
                "loadId='" + loadId + '\'' +
                ", batchId='" + batchId + '\'' +
                ", insertDate='" + insertDate + '\'' +
                ", lastUpdatedDate='" + lastUpdatedDate + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
