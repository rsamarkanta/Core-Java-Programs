package com.ts.addition;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// declaring variables
		int a, b, sum;
		Scanner sc = new Scanner(System.in);
		// take inout from keyboard
		System.out.print("enter two number for addition : a = ");
		a = sc.nextInt();
		System.out.print(" & b = ");
		b = sc.nextInt();
		sc.close();		//close Scanner class object
		// formula to calculate addition
		sum = a + b;
		// print sum of a & b
		System.out.println("a+b = " + sum);
	
	}//main method close
	
}//class close
