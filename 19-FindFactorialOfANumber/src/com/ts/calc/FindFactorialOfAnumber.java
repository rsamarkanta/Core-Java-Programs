package com.ts.calc;

import java.util.Scanner;

public class FindFactorialOfAnumber {

	public static void main(String[] args) {
		int num, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		num = sc.nextInt();
		// Calculate factorial of n! =n * (n-1) * (n-2) * (n-3)*...*(n-n)
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		// print factorial
		System.out.print(num + "! = " + fact);
	}

}
