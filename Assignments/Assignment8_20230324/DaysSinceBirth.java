package com.bytes.assignment8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysSinceBirth {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter your date of birth(dd/mm/yyyy) : ");
		String dob = Obj.nextLine();
		
		DateTimeFormatter FormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate dateOfBirth = LocalDate.parse(dob, FormatObj);
		
		long daysSinceBirth = ChronoUnit.DAYS.between(dateOfBirth, LocalDate.now());
		System.out.println(daysSinceBirth + " days since birth");

	}

}
