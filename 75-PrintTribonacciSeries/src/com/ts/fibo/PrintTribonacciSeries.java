package com.ts.fibo;

import java.util.Scanner;

public class PrintTribonacciSeries {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, n3 = 1, n, term;
		Scanner sc = new Scanner(System.in);

		// take input for term
		System.out.print("Enter term for display Tribonacci series : ");
		term = sc.nextInt();

		// print Tribonacci series
		for (int i = 1; i <= term; i++) {
			// calculate tribonacci
			System.out.print(n1 + ", ");
			n = n1 + n2 + n3;
			n1 = n2;
			n2 = n3;
			n3 = n;
		}
	}

}
