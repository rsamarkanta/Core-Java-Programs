package com.ts.max;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number :");
		a = sc.nextInt();
		b = sc.nextInt();
		// check which is greatest between a and b
		if (a < b)				// if a < b  is true print b is greatest
			System.out.println(b + " is greatest.");
		else						// else print a is greatest
			System.out.println(a + " is greatest.");
	}

}
