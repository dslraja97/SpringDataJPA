package com.learning.repository;

import org.springframework.data.repository.CrudRepository;

import com.learning.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
