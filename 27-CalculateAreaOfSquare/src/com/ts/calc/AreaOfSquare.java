package com.ts.calc;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		float side, area;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side of the Square : ");
		side = sc.nextFloat();
		// calculate area of the Square
		area = side * side;
		System.out.println("Area of a Square is " + area);
	}

}
