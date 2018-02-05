package com.panera.api.service;

import com.panera.api.domain.item.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class FoodMockData {


    public List<Item> mockItemList() {

        List<Item> items = new ArrayList<Item>();
        Franchise franchise = new Franchise("Franchise Id", "PANXXXX", "Franchise Name1", "12/4/2017");
        ItemMajor itemMajor = new ItemMajor("1", "Food & Merchandise");
        ItemUserType itemUserType = new ItemUserType("P", "Purchased item");
        ItemCategory itemCategory = new ItemCategory("11", "Soups");
        ItemInventotyDollars itemInventotyDollars = new ItemInventotyDollars(22.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        ItemInventory itemInventory = new ItemInventory(408.52f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, itemInventotyDollars);
        DataLoad dataLoad = new DataLoad("100348345", "100348345", "12/04/2017 23:57:45", "12/04/2017 23:57:45", "1");
        Item item1 = new Item("20XXXX", franchise, "1474", "10262269", "SOUP AUTUMN SQUASH BISQUE", itemMajor, itemUserType, itemCategory, "End Of Week", itemInventory, dataLoad);
        items.add(item1);
        return items;

    }
}