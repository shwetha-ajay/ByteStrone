package com.bytes.weeklyassignment1;

import java.time.LocalDate;

public class Employee {
	String firstName;
	String lastName;
	LocalDate date;

	public Employee(String firstName, String lastName, LocalDate date) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
