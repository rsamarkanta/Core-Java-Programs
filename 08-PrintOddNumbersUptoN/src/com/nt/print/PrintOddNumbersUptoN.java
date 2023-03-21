package com.nt.print;

import java.util.Scanner;

public class PrintOddNumbersUptoN {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the term n : ");
		n = sc.nextInt();
		sc.close();

		// whenever the occurrence of 'i' will be odd print 'i'
		for (int i = 1; i <= n; i++) {

			if (i % 2 != 0)
				System.out.print(i + ", ");
		}
	}

}
