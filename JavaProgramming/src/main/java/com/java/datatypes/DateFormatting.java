package com.java.datatypes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

	public static void main(String[] args) {
		LocalDate today= LocalDate.now();
		System.out.println(today+"\n");
		
		DateTimeFormatter usDateFormat= DateTimeFormatter.ofPattern("MM-dd-yyy");
		System.out.println(today.format(usDateFormat));
	
		
		
		String usDateString="07-04-2022";
		LocalDate failedDate= LocalDate.parse(usDateString);
		
		DateTimeFormatter usDaeFormat= DateTimeFormatter.ofPattern("MM-dd-yyyy");
		LocalDate theDate= LocalDate.parse(usDateString, usDaeFormat);
	
	}

}
