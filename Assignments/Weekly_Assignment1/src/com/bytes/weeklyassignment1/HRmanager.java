package com.bytes.weeklyassignment1;

import java.time.LocalDate;

public class HRmanager extends Employee {
	String specialiation;

	public HRmanager(String firstName, String lastName, LocalDate date, String specialiation) {
		super(firstName, lastName, date);
		this.specialiation = specialiation;
	}
}
