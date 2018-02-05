package com.panera.api.service;

import com.panera.api.domain.item.FilterDataObject;
import com.panera.api.domain.item.MyObject;
import com.panera.api.repository.MyObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by sjain on 2/5/18.
 */

@Service
public class FilterResponseDataService {

    private final MyObjectRepository myObjectRepository;


    @Autowired
    public FilterResponseDataService(MyObjectRepository myObjectRepository) {
        this.myObjectRepository = myObjectRepository;
    }


    public MyObject getReportCriteria(String queryId){

        FilterDataObject filterDataObject = myObjectRepository.findOne(Integer.parseInt(queryId));

        return null;


    }

}
