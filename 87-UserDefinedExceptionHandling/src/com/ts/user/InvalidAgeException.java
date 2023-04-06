package com.ts.user;

public class InvalidAgeException extends Exception {
	public InvalidAgeException(String msg) {
		System.out.println(msg);
	}
}
