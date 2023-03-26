package com.ts.check;

import java.util.Scanner;

public class CheckArmstrongNumber {
	// function to check if the number is an Armstrong or not
	static boolean isArmstrong(int num) {
		int temp, digits = 0, last = 0, sum = 0;
		temp = num;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = num;
		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}
		if (num == sum)
			return true;
		else
			return false;
	}

	// driver code
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be checked : ");
		num = sc.nextInt();
		if (isArmstrong(num))
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");
	}
}