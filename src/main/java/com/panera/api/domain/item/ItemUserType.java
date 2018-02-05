package com.panera.api.domain.item;

public class ItemUserType {
    private final String itemIdUserTypeDescription;
    private final String itemUserTypeCode;

    public ItemUserType(String itemIdUserTypeDescription, String itemUserTypeCode) {
        this.itemIdUserTypeDescription = itemIdUserTypeDescription;
        this.itemUserTypeCode = itemUserTypeCode;
    }

    public String getItemIdUserTypeDescription() {
        return itemIdUserTypeDescription;
    }

    public String getItemUserTypeCode() {
        return itemUserTypeCode;
    }

    @Override
    public String toString() {
        return "ItemUserType{" +
                "itemIdUserTypeDescription='" + itemIdUserTypeDescription + '\'' +
                ", itemUserTypeCode='" + itemUserTypeCode + '\'' +
                '}';
    }
}