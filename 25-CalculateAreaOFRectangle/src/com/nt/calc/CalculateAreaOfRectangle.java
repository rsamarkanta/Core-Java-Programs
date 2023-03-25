package com.nt.calc;

import java.util.Scanner;

public class CalculateAreaOfRectangle {

	public static void main(String[] args) {
		float length, breadth, area;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length : ");
		length = sc.nextFloat();
		System.out.print("Enter breadth : ");
		breadth = sc.nextFloat();
		//Calculate area of a rectangle
		area = length * breadth;
		System.out.println("Area of the Rectangle is " + area );
	}

}
