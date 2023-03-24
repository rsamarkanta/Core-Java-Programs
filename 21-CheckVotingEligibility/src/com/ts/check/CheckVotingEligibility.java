package com.ts.check;

import java.util.Scanner;

public class CheckVotingEligibility {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		age = sc.nextInt();
		// check for voting eligibility as in India.
		if (age >= 18)
			System.out.println("You are eligible for voting.");
		else
			System.out.println("You are not eligible for voting");
	}

}
