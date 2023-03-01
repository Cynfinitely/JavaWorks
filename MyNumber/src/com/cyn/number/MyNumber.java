package com.cyn.number;

public class MyNumber {
	private int num;

	public MyNumber(int i) {
		// TODO Auto-generated constructor stub
		this.num = i;
	}

	public boolean isPrime() {
		// TODO Auto-generated method stub
		// guard check
		if (num < 2) {
			return false;
		}
		// prime check
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public int sumUptoN() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int x = 1; x <= num; x++) {
			sum = sum + x;
		}
		return sum;
	}

	public int sumOfDivisors() {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public void printaNumberTriangle() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
