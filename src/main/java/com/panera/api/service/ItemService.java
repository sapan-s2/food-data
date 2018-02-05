package com.panera.api.service;

import com.panera.api.domain.item.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sjain on 2/1/18.
 */

@Service
public class ItemService{

    public List<Item> getItemReport(){

        return mockItemList();

    }

    private List<Item> mockItemList(){
        return new FoodMockData().mockItemList();
    }




}
