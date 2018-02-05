//package com.panera.api.endpoint;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
///**
// * Created by smita on 12/25/17.
// */
//
//@RestController
//public class FoodController {
//
//
//    @PostMapping(value = "/employee")
//    public Employee saveEmployee(@RequestBody Employee employee){
//        employeeProducer.sendData(employee);
//       return employee;
//    }
//
//    @GetMapping(value = "/employee")
//    public List<String> getEmployee(){
//       return employeeConsumer.getEmployees();
//    }
//}
