package com.bytes.assignment8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LondonTime {
	public static void main(String[] args) {
		ZoneId LondonTimeZone = ZoneId.of("Europe/London");
		ZonedDateTime LondonTime = ZonedDateTime.now(LondonTimeZone);
		DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("hh:mm:ss ");
		String formattedLondonTime = LondonTime.format(formatTime);

		System.out.println("the London time is : " + formattedLondonTime);
	}

}
