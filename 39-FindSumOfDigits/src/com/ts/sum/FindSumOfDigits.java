package com.ts.sum;

import java.util.Scanner;

public class FindSumOfDigits {

	public static void main(String[] args) {
		int num, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		
		while (num > 0) {
			
			// find remainder
			int rem = num % 10;
			
			// add remainder to sum
			sum = sum + rem;
			
			num = num / 10;
		
		}
		
		System.out.println("Sum of the digits = " + sum);
	
	}

}
