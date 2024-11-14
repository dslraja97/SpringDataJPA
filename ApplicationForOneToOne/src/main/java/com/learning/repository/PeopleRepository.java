package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.People;

public interface PeopleRepository extends JpaRepository<People, Integer> {

}
