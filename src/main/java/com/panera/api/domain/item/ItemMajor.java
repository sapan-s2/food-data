package com.panera.api.domain.item;

public class ItemMajor {
    private final String itemMajorCategoryId;
    private final String itemMajorCategoryDescription;

    public ItemMajor(String itemMajorCategoryId, String itemMajorCategoryDescription) {
        this.itemMajorCategoryId = itemMajorCategoryId;
        this.itemMajorCategoryDescription = itemMajorCategoryDescription;
    }

    public String getItemMajorCategoryId() {
        return itemMajorCategoryId;
    }

    public String getItemMajorCategoryDescription() {
        return itemMajorCategoryDescription;
    }

    @Override
    public String toString() {
        return "ItemMajor{" +
                "itemMajorCategoryId='" + itemMajorCategoryId + '\'' +
                ", itemMajorCategoryDescription='" + itemMajorCategoryDescription + '\'' +
                '}';
    }
}