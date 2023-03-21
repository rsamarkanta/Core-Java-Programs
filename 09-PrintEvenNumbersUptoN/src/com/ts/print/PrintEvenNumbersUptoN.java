package com.ts.print;

import java.util.Scanner;

public class PrintEvenNumbersUptoN {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the term n : ");
		n = sc.nextInt();
		sc.close();

		// whenever the occurrence of 'i' will be even print 'i'
		for (int i = 0; i <= n; i++) {

			if (i % 2 == 0)
				System.out.print(i + ", ");
		}
	}
}
