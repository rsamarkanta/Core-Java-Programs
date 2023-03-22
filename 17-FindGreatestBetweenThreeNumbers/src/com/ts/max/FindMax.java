package com.ts.max;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value for 1st number :");
		a = sc.nextInt();
		
		System.out.println("Enter value for 2nd number :");
		b = sc.nextInt();
		
		System.out.println("Enter value for 3rd number :");
		c = sc.nextInt();

		// check which is greatest between a , b and c
		if (a > b & a > c)				 // if this condition became true print a is greatest
			System.out.println(a + " is greatest among three numbers.");

		else if (b > a & b > c)		// if this condition became true print b is greatest
			System.out.println(b + " is greatest among three numbers.");
		
		else										// else print c is greatest
			System.out.println(c + " is greatest among three numbers.");
	}

}
