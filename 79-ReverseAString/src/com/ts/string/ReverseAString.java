package com.ts.string;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		String str, revStr = "";
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String value : ");
		str = sc.nextLine();

		// reverse string and store it to another String
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}

		// print after reversing
		System.out.println("After reversing : " + revStr);

	}

}
