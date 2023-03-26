package com.bytes.assignment8;
import java.util.Calendar;
public class DefaultCalender {
	public static void main(String[]args) {
		Calendar calender=Calendar.getInstance();
		int year=calender.get(Calendar.YEAR);
		int month=calender.get(Calendar.MONTH);
		int day=calender.get(Calendar.DAY_OF_MONTH);
		int hour=calender.get(Calendar.HOUR_OF_DAY);
		int minute=calender.get(Calendar.MINUTE);
		System.out.printf("Current date and time is: %02d-%02d-%04d  %02d:%02d",day,month,year,hour,minute);
	}

}
