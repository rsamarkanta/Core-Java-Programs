package com.ts.find;

import java.util.Scanner;

public class FindFactorialOfANumber {
	// recursive method to find factorial
	int fact(int n) {
		if (n == 0)
			return 1;
		else
			return n * fact(n - 1);
	}

	// main method
	public static void main(String[] args) {

		int num, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to find factorial : ");
		num = sc.nextInt();

		// find factorial using for loop
		System.out.println("-----------------Using for loop---------------");

		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}

		System.out.println(num + " ! = " + fact);

		System.out.println("-----------------Using recursion---------------");

		// create object to call method
		FindFactorialOfANumber factorial = new FindFactorialOfANumber();
		// call fact() method
		System.out.println(num + " ! = " + factorial.fact(num));

	}

}
