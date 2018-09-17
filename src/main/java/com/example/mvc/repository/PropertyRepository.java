package com.example.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.mvc.entity.Property;


public interface PropertyRepository extends JpaRepository<Property, Long>, JpaSpecificationExecutor<Property>{

}
