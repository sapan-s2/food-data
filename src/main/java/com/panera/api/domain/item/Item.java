package com.panera.api.domain.item;

import com.panera.api.endpoint.ItemController;
import org.springframework.hateoas.ResourceSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * Created by sjain on 2/1/18.
 */

public class Item extends ResourceSupport {

    private final String storeNumber;
    private final Franchise franchise;
    private final String itemId;
    private final String itemCode;
    private final String itemDescription;
    private final ItemMajor itemMajor;
    private final ItemUserType itemUserType;
    private final ItemCategory itemCategory;
    private final String CNTGroupName;
    private final ItemInventory itemInventory;
    private final DataLoad dataLoad;

    public Item(String storeNumber, Franchise franchise, String itemId, String itemCode, String itemDescription, ItemMajor itemMajor, ItemUserType itemUserType, ItemCategory itemCategory, String CNTGroupName, ItemInventory itemInventory, DataLoad dataLoad) {
        this.storeNumber = storeNumber;
        this.franchise = franchise;
        this.itemId = itemId;
        this.itemCode = itemCode;
        this.itemDescription = itemDescription;
        this.itemMajor = itemMajor;
        this.itemUserType = itemUserType;
        this.itemCategory = itemCategory;
        this.CNTGroupName = CNTGroupName;
        this.itemInventory = itemInventory;
        this.dataLoad = dataLoad;
        add(linkTo(ItemController.class).withSelfRel());
    }


    public String getStoreNumber() {
        return storeNumber;
    }

    public Franchise getFranchise() {
        return franchise;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public ItemMajor getItemMajor() {
        return itemMajor;
    }

    public ItemUserType getItemUserType() {
        return itemUserType;
    }

    public ItemCategory getItemCategory() {
        return itemCategory;
    }

    public String getCNTGroupName() {
        return CNTGroupName;
    }

    public ItemInventory getItemInventory() {
        return itemInventory;
    }

    public DataLoad getDataLoad() {
        return dataLoad;
    }

    @Override
    public String toString() {
        return "Item{" +
                "storeNumber='" + storeNumber + '\'' +
                ", franchise=" + franchise +
                ", itemId='" + itemId + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemMajor=" + itemMajor +
                ", itemUserType=" + itemUserType +
                ", itemCategory=" + itemCategory +
                ", CNTGroupName='" + CNTGroupName + '\'' +
                ", itemInventory=" + itemInventory +
                ", dataLoad=" + dataLoad +
                '}';
    }
}
