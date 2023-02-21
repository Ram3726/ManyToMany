package com.entityRelationship.project.repository;

import com.entityRelationship.project.entity.CustomerTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerTable,Integer> {
}
