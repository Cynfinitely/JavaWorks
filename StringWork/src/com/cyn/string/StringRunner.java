package com.cyn.string;

public class StringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
				"Sunday" };

		String mostChar = "";

		for (String day : daysOfWeek) {
			if (day.length() > mostChar.length()) {
				mostChar = day;
			}
		}

		System.out.println(mostChar);

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}

	}

}
