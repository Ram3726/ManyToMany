package com.entityRelationship.project.entity;

import com.entityRelationship.project.model.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Customer_table")

public class CustomerTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cust_id;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;



    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(
            name = "customer_products",
            joinColumns = @JoinColumn(name = "cust_id"),
            inverseJoinColumns = @JoinColumn(name = "prod_id")
    )
    private Set<ProductTable> productTables = new HashSet<>();

    public void productAdd(ProductTable productTable){
        this.productTables.add(productTable);

    }



   /* @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(name= "cust_prod_Table" ,
    joinColumns = {@JoinColumn(name = "cust_id")},
            inverseJoinColumns = {@JoinColumn(name = "prod_id")})

    private Product products;*/

}
