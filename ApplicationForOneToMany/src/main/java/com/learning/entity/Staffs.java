package com.learning.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Staffs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	private String name;
	private Integer salary;

	@OneToMany(mappedBy = "staff", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Address> addr;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public List<Address> getAddr() {
		return addr;
	}

	public void setAddr(List<Address> addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Staffs [empId=" + empId + ", name=" + name + ", salary=" + salary + ", addr=" + addr + "]";
	}

}
