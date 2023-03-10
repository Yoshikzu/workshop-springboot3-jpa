package com.yoshikzu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yoshikzu.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
