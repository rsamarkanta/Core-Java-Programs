package com.ts.check;

import java.util.Scanner;

public class CheckNumberPositiveOrNegative {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		num = sc.nextInt();
		// check num is less than 0 or not
		if (num < 0)
			System.out.println(num + " is negatitive.");
		// check num is greater than 0 or not
		else if (num > 0)
			System.out.println(num + " is positive.");
		else
			System.out.println(num + " is neither positive nor negative.");
	}

}
