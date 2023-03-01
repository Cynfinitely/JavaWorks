package com.cyn.number;

import java.util.Scanner;

public class CubeExampleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int num = -1;
		do {
			if (num != -1) {
				System.out.println("Cube is " + num * num * num);

			}

			System.out.println("Enter a number: ");
			num = input.nextInt();
		} while (num >= 0);
		System.out.println("Wrong input ,bye!");

	}

}
