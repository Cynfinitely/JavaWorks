package com.cyn.firstjavaproject;

public class MultiplicationTable {
	void print() {
		print(5, 1, 10);
//		for (int i = 1; i < 10; i++) {
//			System.out.printf("%d x %d = %d", 5, i, 5 * i).println();
//		}
	}

	void print(int y) {
		print(y, 1, 10);

//		for (int i = 1; i < 10; i++) {
//			System.out.printf("%d x %d = %d", y, i, y * i).println();
//		}
	}

	void print(int y, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d x %d = %d", y, i, y * i).println();
		}
	}

}
