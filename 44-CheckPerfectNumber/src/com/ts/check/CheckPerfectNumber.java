package com.ts.check;

import java.util.Scanner;

public class CheckPerfectNumber {

	public static void main(String[] args) {
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		// find factors of num
		for (int i = 1; i < num; i++) {

			if (num % i == 0) {
				// add all the factors of num
				sum = sum + i;
			}
		}
		// if num is equal to the sum of its factor then print perfect number
		if (num == sum)
			System.out.println("It is a Perfect Number ");
		else
			System.out.println("It is not a Perfect Number");
	}

}
