package com.resnus.euler.problem19;

import java.util.Calendar;
import java.util.Date;

public class SundeyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_YEAR, 1);
		cal.set(Calendar.YEAR, 1901);
		
		//System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		//System.out.println(cal.getTime());
		
		int count = 0;
		while(cal.get(Calendar.YEAR) != 2001){
			cal.add(Calendar.MONTH, 1);
			if(cal.get(Calendar.DAY_OF_WEEK) == 1){
				//System.out.println("Found 1st month Sunday: " + cal.getTime());
				count++;
			}
		}
		System.out.println("Count: " + count + " Took: " + (System.currentTimeMillis() - start));
	}

}