package com.ts.swap;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		num1 = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		num2 = sc.nextInt();
		num1 = num1 + num2;	//add two numbers
		num2 = num1 - num2;	
		num1 = num1 - num2;	
		System.out.println("First number = " + num1 + " , Second number = " + num2);
	}

}
