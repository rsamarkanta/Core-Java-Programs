package com.ts.string;

public class StringMethodsExample {

	public static void main(String[] args) {

		String str1 = "rsamarkanta";
		String str2 = "TechSamar";
		String str3 = "              rsamarkanta      ";
		String str4 = "";

		// print all String values
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);

		// change strings to lowercase
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toLowerCase());

		// change strings to uppercase
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toUpperCase());

		// string concatenation operator to concat two strings
		System.out.println(str1.concat(str2));

		// to find length of string
		System.out.println(str2.length());

		// to remove extra spaces from string from starting or ending
		System.out.println(str3.trim());

		// to check string is empty or not
		System.out.println(str4.isEmpty());

		// change value of string
		str4 = "Github";

		// to check string is empty or not
		System.out.println(str4.isEmpty());

		// to find char in the given index no of String
		System.out.println(str1.charAt(5));

		// to find char/String in the given index no of String
		System.out.println(str2.indexOf('s'));

		// for content comparison
		System.out.println(str3.equals(str4));

		// to replace character/string
		System.out.println(str4.replace('t', 'm'));

	}

}
