package com.ts.user;

public class UserInput {

	public static void main(String[] args) {
		// initialize integer a
		int a;
		// create object for Scanner Class
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// Prompt to user for input value
		System.out.println("Enter value :");
		// take input from user
		a = sc.nextInt();
		// close Scanner class object
		sc.close();
		// print value of a
		System.out.println("a = " + a);
	}
}
