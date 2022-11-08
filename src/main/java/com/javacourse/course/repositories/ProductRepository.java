package com.javacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
