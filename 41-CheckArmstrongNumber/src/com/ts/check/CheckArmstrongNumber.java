package com.ts.check;

import java.util.Scanner;

public class CheckArmstrongNumber {
	// function to check if the number is an Armstrong or not
	static boolean isArmstrong(int num) {
		int temp, digits = 0, last = 0, sum = 0;
		temp = num;
		
		//calculates the number of digits in the given number
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		
		temp = num;
		
		//calculate the sum of each digit when raised to the power of the total number of digits
		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}
		
		//check whether sum is equal to the number  or not
		if (num == sum)
			return true;
		else
			return false;
	}

	// main method 
	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be checked : ");
		num = sc.nextInt();
		//call the method isArmstrong()
		if (isArmstrong(num))
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");
	}
}