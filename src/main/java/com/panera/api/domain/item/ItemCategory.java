package com.panera.api.domain.item;

/**
 * Created by sjain on 2/1/18.
 */
public class ItemCategory {

    private final String itemcategoryCode;
    private final String itemcategoryDscription;

    public ItemCategory(String itemcategoryCode, String itemcategoryDscription) {
        this.itemcategoryCode = itemcategoryCode;
        this.itemcategoryDscription = itemcategoryDscription;
    }

    public String getItemcategoryCode() {
        return itemcategoryCode;
    }

    public String getItemcategoryDscription() {
        return itemcategoryDscription;
    }

    @Override
    public String toString() {
        return "ItemCategory{" +
                "itemcategoryCode='" + itemcategoryCode + '\'' +
                ", itemcategoryDscription='" + itemcategoryDscription + '\'' +
                '}';
    }
}
