package com.cyn.number;

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber number = new MyNumber(7);
		System.out.println(number);

		boolean isPrime = number.isPrime();
		System.out.println(isPrime);

		int sum = number.sumUptoN();
		System.out.println(sum);
//
		int sumOfDivisors = number.sumOfDivisors();
		System.out.println(sumOfDivisors);

		number.printaNumberTriangle();

	}

}
