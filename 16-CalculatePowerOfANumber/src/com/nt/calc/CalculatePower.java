package com.nt.calc;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		int num;
		int p;
		int result = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		num = sc.nextInt();
		System.out.print("Enter the power : ");
		p = sc.nextInt();
		// calculate 'num' to the power 'p' by user
		for (int i = 1; i <= p; i++) {
			result = result * num;
		}
		System.out.println("Result using user defined method : " + result);
		// calculate 'num' to the power 'p' using Predefined method
		System.out.println("Result using Predefined method :" + (int) Math.pow(num, p));
	}

}
