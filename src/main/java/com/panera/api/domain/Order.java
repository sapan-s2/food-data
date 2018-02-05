package com.panera.api.domain;

/**
 * Created by sjain on 2/1/18.
 */
public class Order {

    private final String id;
    private final String name;

    public Order(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
