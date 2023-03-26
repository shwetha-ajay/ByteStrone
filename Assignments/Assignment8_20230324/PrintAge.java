package com.bytes.assignment8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PrintAge {
	public static void main (String []args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter your date of birth(dd/mm/yyyy) : ");
		String dob = Obj.nextLine();
		
		DateTimeFormatter FormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate dateOfBirth = LocalDate.parse(dob, FormatObj);
//		 LocalDate dob = LocalDate.parse(dobString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	      
	        Period period = Period.between(dateOfBirth, LocalDate.now());
	        int years = period.getYears();
	        int months = period.getMonths();
	        int days = period.getDays();
	        System.out.printf("I am %d years, %d months and %d days old.", years, months, days);
	
	}

}
