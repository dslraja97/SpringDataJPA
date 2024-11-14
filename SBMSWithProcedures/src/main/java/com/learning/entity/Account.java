package com.learning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
	private Integer id;
	private Integer acctNumber;
	private String type;
	private String branch;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(Integer acctNumber) {
		this.acctNumber = acctNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", acctNumber=" + acctNumber + ", type=" + type + ", branch=" + branch + ", name=" + name
				+ "]";
	}

}
