package com.ts.calc;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		float radius, area;
		final float PI = 3.141f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the Circle : ");
		radius = sc.nextFloat();
		// Calculate area of the Circle
		area = PI * radius * radius;
		System.out.println("Area of the Circle is " + area);
	}

}
