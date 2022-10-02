package com.learning.collections;

import java.util.Date;

public class Employee implements Cloneable {

	private int id;
	private String name;
	private String dept;
	private Date birthDate;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String dept, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.birthDate = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", birthDate=" + birthDate + "]";
	}
	
}
