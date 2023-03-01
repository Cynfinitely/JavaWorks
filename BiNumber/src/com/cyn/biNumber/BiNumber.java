package com.cyn.biNumber;

public class BiNumber {
	private int num1;
	private int num2;

	BiNumber(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add() {
		return num1 + num2;
	}

	public int multiply() {
		return num1 * num2;
	}

	public void Double() {
		this.num1 *= num1;
		this.num2 *= num2;
	}

	public int getNum1() {
		// TODO Auto-generated method stub
		return this.num1;
	}

	public int getNum2() {
		// TODO Auto-generated method stub
		return this.num2;
	}

}
