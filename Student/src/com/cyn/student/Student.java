package com.cyn.student;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
//	private int[] marks;  Array method
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) { // three dots will allow you to accept variable arguments
		this.setName(name);

		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
//		return marks.length; it is array method
		return marks.size(); // this is ArrayList method
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		// TODO Auto-generated method stub
//		int max = 0;
//		for (int mark : marks) {
//			if (mark > max) {
//				max = mark;
//			}
//		}
//		return max;

		return Collections.max(marks);
	}

	public int getMinimumMark() {
		// TODO Auto-generated method stub
//		int min = 101;
//		for (int mark : marks) {
//			if (mark < min) {
//				min = mark;
//			}
//		}
//		return min;

		return Collections.min(marks);
	}

	public BigDecimal getAvarageMarks() {
		// TODO Auto-generated method stub
		int sum = getTotalSumOfMarks();
		int num = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(num), 3, RoundingMode.UP);
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int i) {
		// TODO Auto-generated method stub
		marks.add(i);

	}

	public void removeMarkAtIndex(int i) {
		// TODO Auto-generated method stub
		marks.remove(i);

	}

}
