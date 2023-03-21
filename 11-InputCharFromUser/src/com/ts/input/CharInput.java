package com.ts.input;

import java.util.Scanner;

public class CharInput {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any character : ");

		// take only 1 character input at a time
		ch = sc.next().charAt(0);
		System.out.println("You have entered : " + ch);
	}

}
