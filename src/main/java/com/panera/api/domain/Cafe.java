package com.panera.api.domain;

import com.panera.api.domain.item.Franchise;
import com.panera.api.domain.item.Item;

/**
 * Created by sjain on 2/1/18.
 */
public class Cafe
{

    private final String storeNumber;
    private final Franchise franchise;
    private final Item item;


    public Cafe(String storeNumber, Franchise franchise, Item item) {
        this.storeNumber = storeNumber;
        this.franchise = franchise;
        this.item = item;
    }

    public String getStoreNumber() {
        return storeNumber;
    }

    public Franchise getFranchise() {
        return franchise;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "storeNumber='" + storeNumber + '\'' +
                ", franchise=" + franchise +
                ", item=" + item +
                '}';
    }
}
