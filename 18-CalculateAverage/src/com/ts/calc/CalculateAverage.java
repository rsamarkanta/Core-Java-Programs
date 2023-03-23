package com.ts.calc;

import java.util.Scanner;

public class CalculateAverage {

	public static void main(String[] args) {
		// declare variable for marks
		float m1, m2, m3, m4, m5, m6;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks for 6 Subjects  : ");
		m1 = sc.nextFloat();
		m2 = sc.nextFloat();
		m3 = sc.nextFloat();
		m4 = sc.nextFloat();
		m5 = sc.nextFloat();
		m6 = sc.nextFloat();

		// calculate total
		float total = m1 + m2 + m3 + m4 + m5 + m6;
		// calculate average
		float avg = total / 6;

		// print total marks
		System.out.println("Total mark = " + total);
		// print average mark
		System.out.println("Average mark = " + avg);
	}

}
