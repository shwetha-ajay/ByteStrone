package com.bytes.weeklyassignment1;

import java.time.LocalDate;

public class Engineer extends Employee {
	String techStack;

	public Engineer(int empId,String firstName, String lastName, String date, String techStack) {
		super(empId,firstName, lastName, date);
		this.techStack = techStack;
	}

	public String getTechStack() {
		return techStack;
	}

	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}
	
	
	

}
