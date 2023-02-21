package com.entityRelationship.project.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Customer {

    private String name;
    private String address;

    private List<Product> productList;

}
