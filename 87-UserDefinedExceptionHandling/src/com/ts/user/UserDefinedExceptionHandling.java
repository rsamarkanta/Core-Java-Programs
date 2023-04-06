package com.ts.user;

public class UserDefinedExceptionHandling {

	public static void vote(int age) throws InvalidAgeException{
		if (age < 18) {
			throw new InvalidAgeException("Not eligible for Voting...");
		} else {
			System.out.println("Eligible for voting...");
		}

	}

	public static void main(String[] args) {
		try {
			vote(17);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
