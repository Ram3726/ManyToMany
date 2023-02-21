package com.entityRelationship.project.controller;

import com.entityRelationship.project.model.Customer;
import com.entityRelationship.project.model.Product;
import com.entityRelationship.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public String save(@RequestBody Customer customers){
        String outPutMsg = this.customerService.saveCustomer(customers);
        return outPutMsg;
    }
    @GetMapping("/test")
    public String test(){
        return "hello";
    }




}
