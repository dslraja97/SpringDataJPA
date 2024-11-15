package com.learning.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	private String name;
	private Integer age;
	private String sex;
	@Id
	private Long phonenumber;
	private String email;
	private String nativePlace;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", sex=" + sex + ", phonenumber=" + phonenumber + ", email=" + email
				+ ", nativePlace=" + nativePlace + "]";
	}

}
