package com.bytes.weeklyassignment1;

import java.time.LocalDate;

//import java.time.LocalDate;

public class Admin extends Employee {
	String Area;

	public Admin(int empId,String firstName, String lastName, LocalDate dateOfBirth, String area) {
		super(empId,firstName, lastName, dateOfBirth);
		Area = area;
		
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}
	

}
