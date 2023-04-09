package com.bytes.weeklyassignment1;

//import java.time.LocalDate;

public class Admin extends Employee {
	String Area;

	public Admin(int empId,String firstName, String lastName, String date, String area) {
		super(empId,firstName, lastName, date);
		Area = area;
		
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}
	

}
