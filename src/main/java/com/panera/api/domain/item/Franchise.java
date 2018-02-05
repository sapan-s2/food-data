package com.panera.api.domain.item;

/**
 * Created by sjain on 2/1/18.
 */
public class Franchise {

    private String id;
    private String name;
    private String descriptipon;
    private String bussinessDate;

    public Franchise(String id, String name, String descriptipon, String bussinessDate) {
        this.id = id;
        this.name = name;
        this.descriptipon = descriptipon;
        this.bussinessDate = bussinessDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescriptipon() {
        return descriptipon;
    }

    public String getBussinessDate() {
        return bussinessDate;
    }
}
