package com.ts.display;

import java.util.Scanner;

public class DisplayMultiplicationTable {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to see multiplication Table : ");
		num = sc.nextInt();
		// display multiplication table for num
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
