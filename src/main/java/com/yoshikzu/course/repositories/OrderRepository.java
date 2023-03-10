package com.yoshikzu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yoshikzu.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
