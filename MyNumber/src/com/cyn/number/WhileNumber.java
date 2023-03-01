package com.cyn.number;

public class WhileNumber {
	private int num;

	public WhileNumber(int i) {
		// TODO Auto-generated constructor stub
		this.num = i;
	}

	public void printSquareUptoLimit() {
		// TODO Auto-generated method stub
		int i = 1;
		while (i * i < num) {
			System.out.println(i * i);
			i++;
		}

	}

	public void printCubesUptoLimit() {
		// TODO Auto-generated method stub
		int i = 1;
		while (i * i < num) {
			System.out.println(i * i * i);
			i++;
		}

	}

}
