package com.ts.change;

import java.util.Scanner;

public class ChangeCharacterCase {

	public static void main(String[] args) {
		char ch, ch2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Character : ");
		ch = sc.next().charAt(0);
		// check if character is in uppercase , convert it to lowercase
		if (ch >= 'A' && ch <= 'Z') {
			ch2 = Character.toLowerCase(ch);
			System.out.println("Lowercase : " + ch2);
		} else { // else convert it to Uppercase
			ch2 = Character.toUpperCase(ch);
			System.out.println("Uppercase : " + ch2);
		}
	}
}
