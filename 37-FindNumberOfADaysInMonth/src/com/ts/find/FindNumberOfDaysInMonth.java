package com.ts.find;

import java.util.Scanner;

public class FindNumberOfDaysInMonth {

	public static void main(String[] args) {
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month number : ");
		month = sc.nextInt();
		//print month name if month number will match
		if (month == 1)
			System.out.println("Jan - 31");
		else if (month == 2)
			System.out.println("Feb - 28");
		else if (month == 3)
			System.out.println("March - 31");
		else if (month == 4)
			System.out.println("April - 30");
		else if (month == 5)
			System.out.println("May - 31");
		else if (month == 6)
			System.out.println("June - 30");
		else if (month == 7)
			System.out.println("July - 31");
		else if (month == 8)
			System.out.println("Aug - 31");
		else if (month == 9)
			System.out.println("Sep - 30");
		else if (month == 10)
			System.out.println("Oct - 31");
		else if (month == 11)
			System.out.println("Nov - 30");
		else if (month == 12)
			System.out.println("Dec - 31");
		else
			System.out.println("Invalid month number....");
	}

}
