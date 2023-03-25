package com.ts.check;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any year in 'YYYY' Format : ");
		year = sc.nextInt();
		//  Using following condition check the year is leap year or not 
		if (year % 100 == 0 && year % 400 == 0 || year % 100 != 100 && year % 4 == 0)
			System.out.println("Leap year");
		else
			System.out.println("Not a leap year");
	}

}
