package com.cyn.myChar;

public class MyCharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChar myChar = new MyChar('k');
		System.out.println(myChar.getX());

		System.out.println(myChar.isVowel());
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabet());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
	}

}
