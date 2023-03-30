package com.bytes.weeklyassignment1;

import java.time.LocalDate;

public class Admin extends Employee {
	String Area;

	public Admin(String firstName, String lastName, LocalDate date, String area) {
		super(firstName, lastName, date);
		Area = area;
	}
	

}
