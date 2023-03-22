package com.ts.ascii;

import java.util.Scanner;

public class PrintAsciiValue {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter any character : ");

		// take only 1 character input at a time
		ch = sc.next().charAt(0);
		//convert char into ascii value
		int n = ch;
		System.out.println("ASCII value  of '" + ch + "' is : " + n);
	}

}
