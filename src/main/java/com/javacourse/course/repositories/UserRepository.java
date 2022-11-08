package com.javacourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
