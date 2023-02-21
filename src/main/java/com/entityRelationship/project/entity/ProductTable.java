package com.entityRelationship.project.entity;

import com.entityRelationship.project.model.Customer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "product_Table")
public class ProductTable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer prod_id;

    @Column(name="food_Name")
    private String foodName;

    @Column(name="drink_Name")
    private String drinkName;

    @Column(name="extra_Item")
    private String extraItem;



   /* @ManyToMany(mappedBy = "products")
    private Set<Customer> customers = new HashSet<>();*/
}

