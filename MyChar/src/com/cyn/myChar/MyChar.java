package com.cyn.myChar;

public class MyChar {
	private char x;

	public MyChar(char x) {
		// TODO Auto-generated constructor stub
		this.setX(x);
	}

	public boolean isVowel() {
		char y = Character.toLowerCase(x);
		System.out.println(y);

		if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u') {
			return true;
		} else {
			return false;
		}

	}

	public boolean isNumber() {
		// you can run (int)'0' , (int)'9' to see their values.
		if (x >= 48 && x <= 57) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isAlphabet() {
		// you can run (int)'a' , (int)'z' and (int)'A' , (int)'Z' to see their values.
		if ((x >= 65 && x <= 90) || (x >= 97 && x <= 122)) {
			return true;
		} else {
			return false;
		}
	}

	public static void printLowerCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}

	}

	public static void printUpperCaseAlphabets() {
		// TODO Auto-generated method stub
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}

	}

	public char getX() {
		return x;
	}

	public void setX(char x) {
		this.x = x;
	}

}
