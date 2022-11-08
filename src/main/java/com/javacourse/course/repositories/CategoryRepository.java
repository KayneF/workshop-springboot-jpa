package com.javacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
