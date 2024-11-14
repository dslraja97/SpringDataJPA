package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, Integer> {

}
