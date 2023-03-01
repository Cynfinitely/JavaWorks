package com.cyn.student;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = { 45, 56, 42 };
		Student student = new Student("Ranga", marks);

		int number = student.getNumberOfMarks();
		System.out.println(number);

		int sum = student.getTotalSumOfMarks();
		System.out.println(sum);

		int maximumMark = student.getMaximumMark();
		System.out.println(maximumMark);

		int minimumMark = student.getMinimumMark();
		System.out.println(minimumMark);

		BigDecimal avarage = student.getAvarageMarks();
		System.out.println(avarage);

		System.out.println(student);

		student.addNewMark(24);
		System.out.println(student);

		student.removeMarkAtIndex(1);
		System.out.println(student);
	}

}
