package com.ts.count;

import java.util.Scanner;

public class CountDigitsOfANumber {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int count = 0;
		// calculate digits in num
		while (num > 0) {
			int div = num % 10;
			count++;
			num = num / 10;
		}
		System.out.println("There is only " + count + " digits in this number.");

	}

}
