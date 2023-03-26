package com.ts.check;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int num, count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		num = sc.nextInt();

		// count factors of num
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		// if factors is only 2 then print prime number
		if (count == 2)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
	}

}
