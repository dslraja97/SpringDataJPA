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
		// StudentRepository bean = run.getBean(StudentRepository.class);
		EmployeeRepository employeeRepository = run.getBean(EmployeeRepository.class);

		/*
		 * Pagination COncept PageRequest pageRequest = PageRequest.of(0, 5); org.springframework.data.domain.Page<Student>
		 * findAll = bean.findAll(pageRequest); List<Student> content = findAll.getContent();
		 * content.forEach(System.out::println);
		 */

		/*
		 * soring Concept List<Student> findAll = bean.findAll(Sort.by("standard").descending());
		 * findAll.forEach(System.out::println);
		 */

		/*
		 * Example or QBE COncept Employees employees = new Employees(); employees.setDesignation("employee");
		 * 
		 * Example<Employees> example = Example.of(employees); List<Employees> list = employeeRepository.findAll(example);
		 * list.forEach(System.out::println);
		 */
		// employeeRepository.deleteEmployee(11);
		// employeeRepository.updateEmployee(8, "Associate");
		employeeRepository.insertEmployee(11, "Garudan", "Associate", 20000);
		List<Employees> list = employeeRepository.findAll();
		list.forEach(System.out::println);
	}

}