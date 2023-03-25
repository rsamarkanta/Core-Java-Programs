package com.ts.calc;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		float a,b,c,sp,area;
		System.out.print("Enter sides of the Traingle  : ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		//calculate semi-perimeter
		sp=(a+b+c)/2;
		//calculate area of Triangle
		area=(float) Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		System.out.println("Area Of Triangle is "+area);
	}

}
