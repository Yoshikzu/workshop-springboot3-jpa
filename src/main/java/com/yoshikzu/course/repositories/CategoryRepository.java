package com.yoshikzu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yoshikzu.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
