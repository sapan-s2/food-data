package com.panera.api.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.panera.api.domain.FoodReport;
import com.panera.api.domain.FoodReportBuilder;
import com.panera.api.domain.item.Item;
import com.panera.api.domain.item.MyObject;
import com.panera.api.domain.item.FilterDataObject;
import com.panera.api.domain.item.ResponseObject;
import com.panera.api.repository.DataObject;
import com.panera.api.repository.MyObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * Created by sjain on 2/2/18.
 */

@Service
public class FoodReportService {

    private final MyObjectRepository myObjectRepository;

    @Autowired
    public FoodReportService(MyObjectRepository myObjectRepository) {
        this.myObjectRepository = myObjectRepository;
    }

    public List<FoodReport> getFoodReportFlat() {
        return mockItemList();
    }

    private List<FoodReport> mockItemList(){
        List<Item> items = new FoodMockData().mockItemList();
        return items.stream().map( item -> mapFoodReportData(item)).collect(toList());
    }

    private FoodReport mapFoodReportData(Item item){
        return new FoodReportBuilder().setFoodReportFlat(item).createFoodReport();
    }


    public MyObject saveReportCriteria(HashMap<String, Boolean> foodReport){

        final ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
        final MyObject myObject = mapper.convertValue(foodReport, MyObject.class);

        List<String> list1  =
                myObject.getAdditionalProperties()
                        .entrySet().stream()
                        .filter(mapo -> mapo.getValue() == Boolean.TRUE)
                        .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()))
                        .keySet().stream().collect(toList());
        ;

        DataObject dataObject = new DataObject();

//        for (String listTemp : list1){
//
////            String s = dataObject + "." + "set" + listTemp.substring(0, 1).toUpperCase() +listTemp.substring(1) + "()";
//            try {
//                Field declaredField = dataObject.getClass().getDeclaredField(listTemp);
//                declaredField.setAccessible(true);
//                declaredField.setBoolean();
//                dataObject.getClass().se
//                declaredField.set(listTemp,Boolean.TRUE);
//            } catch (NoSuchFieldException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//
//        }



        ArrayList arrayList = new ArrayList();
        arrayList.add(list1);
        FilterDataObject filterDataObject = new FilterDataObject();
        filterDataObject.setMetaDataList(arrayList);
        myObjectRepository.save(filterDataObject);
        myObject.setQueryId(filterDataObject.getId().toString());
        ResponseObject responseObject = new ResponseObject(filterDataObject.getMetaDataList());
        return myObject;

    }

    private List<String> getAllDataObjectProperties(){
        ArrayList <String> fieldNames = new ArrayList<>();

        DataObject dataObject = new DataObject();

        for (Field field : dataObject.getClass().getDeclaredFields()) {
            field.setAccessible(true); // You might want to set modifier to public first.
            Object value = null;
            try {
                value = field.get(dataObject);
            } catch (IllegalAccessException e) {
                e.getCause();
            }
            if (value != null) {
                System.out.println(field.getName() + "=" + value);
                fieldNames.add(field.getName());
            }
        }
        return fieldNames;
    }




}
