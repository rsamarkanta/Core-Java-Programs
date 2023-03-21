package com.ts.sum;

import java.util.Scanner;

public class CalculateSumOfEvenOrOddNumbers {

	public static void main(String[] args) {
		int n, sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range  : ");
		n = sc.nextInt();
		
		//if range is even then calculate sum of even numbers otherwise calculate odd numbers
		if (n % 2 == 0) {
			for (int i = 0; i <= n; i = i + 2) {
				sum = sum + i;
			}
			System.out.print("Sum of Even numbers is " + sum);
		} else {
			for (int i = 1; i <= n; i = i + 2) {
				sum = sum + i;
			}
			System.out.print("Sum of Odd numbers is " + sum);
		}
	}

}
