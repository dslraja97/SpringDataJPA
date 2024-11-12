package com.learning;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.entity.Employees;
import com.learning.repository.EmployeeRepository;

@SpringBootApplication
public class SpringDataJpaAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaAppApplication.class, args);
		EmployeeRepository employeeRepository = run.getBean(EmployeeRepository.class);
		// Employees employees1 = new Employees(7, "garudan", "employee", 10000);
		// Employees employees2 = new Employees(8, "Anjanayan", "employee", 12000);
		// Employees employees3 = new Employees(9, "suriyan", "employee", 13000);
		// Employees employees4 = new Employees(10, "chandran", "employee", 14000);
		// Employees employees5 = new Employees(11, "Natachitram", "employee", 14000);
		// List<Employees> employeesList = Arrays.asList(employees1, employees2, employees3, employees4, employees5);
		// employeeRepository.saveAll(employeesList);
		List<Employees> findByDesignation = employeeRepository.findByDesignation("employee");
		System.out.println("Custom Query to get the employee designation");
		findByDesignation.forEach(System.out::println);
		List<Employees> findBySalaryGreaterThanEqual = employeeRepository.findBySalaryGreaterThanEqual(10000);
		System.out.println("Custom Query to get the employee salary");
		findBySalaryGreaterThanEqual.forEach(System.out::println);
		List<Employees> findBySalaryLessThanEqual = employeeRepository.findBySalaryLessThanEqual(10000);
		System.out.println("Custom Query to get the employee salary");
		findBySalaryLessThanEqual.forEach(System.out::println);
		List<Employees> findByDesignationAndSalaryGreaterThanEqual = employeeRepository
				.findByDesignationAndSalaryGreaterThanEqual("employee", 13000);
		System.out.println("Custom Query to get the employee based on designation & salary");
		findByDesignationAndSalaryGreaterThanEqual.forEach(System.out::println);
	}

}