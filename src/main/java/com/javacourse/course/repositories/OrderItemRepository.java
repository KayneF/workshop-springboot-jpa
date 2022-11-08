package com.javacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
