package com.bytes.assignment8;

import java.time.LocalDate;

public class AfterTwoWeeks {
	public static void main(String[] args) {
		LocalDate Today = LocalDate.now();
		LocalDate twoWeeksLater = Today.plusWeeks(2);
		System.out.println("today's date: " + Today);
		System.out.println("date after two weeks: " + twoWeeksLater);

	}

}
