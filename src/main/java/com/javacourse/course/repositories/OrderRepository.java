package com.javacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
