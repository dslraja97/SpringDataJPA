package com.learning.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Account {
	@EmbeddedId
	private AccountKey accountKey;
	private String name;
	private String branch;

	public AccountKey getAccountKey() {
		return accountKey;
	}

	public void setAccountKey(AccountKey accountKey) {
		this.accountKey = accountKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Account [accountKey=" + accountKey + ", name=" + name + ", branch=" + branch + "]";
	}

}
