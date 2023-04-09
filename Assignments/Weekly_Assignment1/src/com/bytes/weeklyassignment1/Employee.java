package com.bytes.weeklyassignment1;

//import java.time.LocalDate;

public class Employee {
	int empId;
	String firstName;
	String lastName;
	String date;

	public Employee(int empId,String firstName, String lastName, String date) {
		super();
		this.empId=empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
	}

	
	public int getEmpId() {
		return empId;
	}

	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
