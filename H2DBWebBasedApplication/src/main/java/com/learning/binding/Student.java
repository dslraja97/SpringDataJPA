package com.learning.binding;

import java.util.Arrays;

public class Student {

	private Integer sid;
	private String name;
	private String sex;
	private String email;
	private String course;
	private String[] timings;

	public Integer getSid() {
		return sid;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String[] getTimings() {
		return timings;
	}

	public void setTimings(String[] timings) {
		this.timings = timings;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", sex=" + sex + ", email=" + email + ", course=" + course
				+ ", timings=" + Arrays.toString(timings) + "]";
	}

}
