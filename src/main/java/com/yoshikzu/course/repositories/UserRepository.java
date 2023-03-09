package com.yoshikzu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yoshikzu.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
