package com.ts.fibo;

import java.util.Scanner;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3 = 0, t;
		Scanner sc = new Scanner(System.in);

		// take input for term
		System.out.print("Enter term for display fibonacci series : ");
		t = sc.nextInt();

		// print fibonacci series
		System.out.print(n1 + ", " + n2);
		for (int i = 2; i < t; i++) {
			n3 = n1 + n2;
			System.out.print(", " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
