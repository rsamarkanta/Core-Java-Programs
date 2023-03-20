package com.ts.sum;

import java.util.Scanner;

public class SumOfNumbersUptoN {

	public static void main(String[] args) {

		int n;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any Number  : ");
		n = sc.nextInt();
		sc.close();

		// for loop to increase the value of i upto n
		for (int i = 1; i <= n; i++) {
			// calculate sum
			sum = sum + i;
		}
		//print sum value
		System.out.println("Sum of natural numbers upto " + n + "  = " + sum);
	}

}
