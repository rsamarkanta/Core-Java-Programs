package com.ts.reverse;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		int num, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		num = sc.nextInt();
		// reverse num and store it to rev
		while (num > 0) {
			int div = num % 10;
			rev = (rev * 10) + div;
			num = num / 10;
		}
		System.out.println("Afer reverse : " + rev);
	}

}
