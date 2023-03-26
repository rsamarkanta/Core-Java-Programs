package com.ts.check;

import java.util.Scanner;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		int num, num2, rev = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number : ");
		num = sc.nextInt();

		// store value of num into num2
		num2 = num;

		while (num > 0) {

			int rem = num % 10;

			// store reverse of num into rev
			rev = (rev * 10) + rem;

			num = num / 10;
		}

		// check num2 is equals to rev or not
		// if num2 is equals to rev then it is palindrome number
		if (num2 == rev)

			System.out.println("Palindrome Number");

		else

			System.out.println("Not a Palindrome Number");
	}

}
