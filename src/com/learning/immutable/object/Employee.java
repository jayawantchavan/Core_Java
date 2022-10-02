package com.learning.immutable.object;

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
	
	public String getDept() {
		return dept;
	}
	
	public String getName() {
		return name;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", birthDate=" + birthDate + "]";
	}

}
