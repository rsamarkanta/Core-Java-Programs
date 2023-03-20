package com.ts.print;

import java.util.Scanner;

public class PrintNumbersUptoN {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of terms : ");
		n = sc.nextInt();
		sc.close();

		// for loop to increase the value of i uptto n
		for (int i = 1; i <= n; i++) {
			// print value of i repeatedly
			System.out.print(i + ",\t");
		}
	}

}
