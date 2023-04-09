package com.bytes.weeklyassignment1;

import java.time.LocalDate;

public class HRmanager extends Employee {
	String specialiation;

	public HRmanager(int empId,String firstName, String lastName, String date, String specialiation) {
		super(empId,firstName, lastName, date);
		this.specialiation = specialiation;
	}

	public String getSpecialiation() {
		return specialiation;
	}

	public void setSpecialiation(String specialiation) {
		this.specialiation = specialiation;
	}
}
