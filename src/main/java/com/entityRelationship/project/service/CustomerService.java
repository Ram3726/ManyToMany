package com.entityRelationship.project.service;

import com.entityRelationship.project.entity.CustomerTable;
import com.entityRelationship.project.entity.ProductTable;
import com.entityRelationship.project.model.Customer;
import com.entityRelationship.project.model.Product;
import com.entityRelationship.project.repository.CustomerRepository;
import com.entityRelationship.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;



    public String saveCustomer(Customer customers){
        CustomerTable customerTable =new CustomerTable();

        customerTable.setName(customers.getName());
        customerTable.setAddress(customers.getAddress());

        List<Product> productList = customers.getProductList();

        for(Product product1: productList){

            ProductTable productTable = new ProductTable();
            productTable.setDrinkName(product1.getDrinkName());
            productTable.setExtraItem(product1.getExtraItem());
            productTable.setFoodName(product1.getFoodName());

            customerTable.productAdd(productTable);

        }

        try {
            customerRepository.save(customerTable);
        } catch (Exception e) {
            System.err.println("Error details " + e.getMessage());
        }
        return "success";
    }
}
