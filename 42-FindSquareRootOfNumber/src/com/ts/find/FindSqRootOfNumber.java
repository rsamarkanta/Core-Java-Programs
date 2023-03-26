package com.ts.find;

import java.util.Scanner;

public class FindSqRootOfNumber {

	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		num = sc.nextInt();

		// predefined Sq. root method of Math class
		double m = Math.sqrt(num);

		// print sq. root of num
		System.out.println("Square root of " + num + " is " + m);
	}

}
