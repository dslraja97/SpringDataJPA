package com.learning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

	public List<Employees> findByName(String name);

	public List<Employees> findByDesignation(String designation);

	public List<Employees> findBySalaryGreaterThanEqual(int salary);

	public List<Employees> findBySalaryLessThanEqual(int salary);

	public List<Employees> findByDesignationAndSalaryGreaterThanEqual(String designation, int salary);

}
