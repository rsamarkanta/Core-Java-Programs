package com.ts.calc;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		int choice, num1, num2, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.println("Enter your choice for any Calculation : ");

		choice = sc.nextInt();
		System.out.println("Enter two numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		switch (choice) {
		// calculate Addition
		case 1:
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		// calculate Subtraction
		case 2:
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		// calculate Multiplication
		case 3:
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		// calculate Division
		case 4:
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
		// other than the above choice will be considered as invalid
		default:
			System.out.println("Invalid Choice");
		}
	}
}
