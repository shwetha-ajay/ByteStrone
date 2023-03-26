package com.bytes.assignment8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;
import java.time.Period;

public class YearMonthCalculator {
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter from date (dd/mm/yyyy) : ");
		String date1 = Obj.nextLine();
		System.out.println("Enter to date (dd/mm/yyyy) : ");
		String date2 = Obj.nextLine();
		LocalDate date1String = LocalDate.parse(date1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate date2String = LocalDate.parse(date2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Period period = Period.between(date1String, date2String);
		int year=period.getYears();
		int month=period.getMonths();
		System.out.printf("there are %d years and %d months between the given dates",year,month);
		
	}

}
