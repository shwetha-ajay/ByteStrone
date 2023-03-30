package com.bytes.weeklyassignment1;

import java.time.LocalDate;

public class Engineer extends Employee {
	String techStack;

	public Engineer(String firstName, String lastName, LocalDate date, String techStack) {
		super(firstName, lastName, date);
		this.techStack = techStack;
	}
	
	
	

}
