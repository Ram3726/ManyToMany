package com.entityRelationship.project.repository;

import com.entityRelationship.project.entity.ProductTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductTable,Integer> {
}
