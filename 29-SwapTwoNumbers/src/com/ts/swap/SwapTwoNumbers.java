package com.ts.swap;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int num1, num2, num3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		num1 = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		num2 = sc.nextInt();
		num3 = num1; // store num1 value in num3
		num1 = num2; // store num2 value in num1
		num2 = num3; // store num3 value in num2 i.e num1 value exchanges to num2
		System.out.println("First number = " + num1 + " , Second number = " + num2);
	}

}
