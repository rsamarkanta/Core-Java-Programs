package com.ts.check;

//import Scanner class
import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		// declare an integer variable
		int n;
		// create Scanner classs object
		Scanner sc = new Scanner(System.in);
		// give instruction to user to input a number
		System.out.print("Enter a number to check odd/even : ");
		// take input from keyboard
		n = sc.nextInt();

		if (n % 2 == 0) 		// if condition became true print even
			System.out.println(n + " is an Even Number");
		else							 // if condition became false print odd
			System.out.println(n + " is an Odd number");
	}

}
