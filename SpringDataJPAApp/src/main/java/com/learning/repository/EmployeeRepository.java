package com.learning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.learning.entity.Employees;

import jakarta.transaction.Transactional;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

	public List<Employees> findByName(String name);

	public List<Employees> findByDesignation(String designation);

	public List<Employees> findBySalaryGreaterThanEqual(int salary);

	public List<Employees> findBySalaryLessThanEqual(int salary);

	public List<Employees> findByDesignationAndSalaryGreaterThanEqual(String designation, int salary);

	@Query("delete from Employees where id= :eid")
	@Transactional
	@Modifying
	public void deleteEmployee(int eid);

	@Query("update Employees set designation =:designation where id=:eid")
	@Modifying
	@Transactional
	public void updateEmployee(int eid, String designation);

	@Query("insert into Employees(id,name,designation,salary) values (:id, :name ,:designation ,:salary)")
	@Modifying
	@Transactional
	public void insertEmployee(int id, String name, String designation, int salary);
}
