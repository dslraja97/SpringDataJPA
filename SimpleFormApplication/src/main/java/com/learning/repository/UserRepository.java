package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.bean.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
