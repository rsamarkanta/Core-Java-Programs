package com.ts.calc;

import java.util.Scanner;

public class CalculateTaxOfASalary {

	public static void main(String[] args) {
		float sal;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your basic salary : ");
		sal = sc.nextFloat();
		// Calculate tax
		if (sal < 10000)
			System.out.println("No tax ....");
		if (sal >= 10000 && sal < 100000) {
			float tax = sal / 100 * 10;
			System.out.println(sal+"..........."+tax);
		} else if (sal >= 100000) {
			float tax = (sal / 100 * 20);
			System.out.println(sal+"..........."+tax);
		}
	}

}
