package com.cognizant.app.modal;

public class User {
	
	private String name;
	private String empId;
	
	public User(String name, String empId) {
		this.name=name;
		this.empId=empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
}
