package com.panera.api.repository;

import com.panera.api.domain.item.FilterDataObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sjain on 2/2/18.
 */

@Repository
public interface MyObjectRepository extends CrudRepository<FilterDataObject,Integer> {


}
