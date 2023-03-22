package com.ts.check;

import java.util.Scanner;

public class CheckVowelOrConsonant {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter any character : ");

		// take only 1 character input at a time
		ch = sc.next().charAt(0);
		//check the input character is vowel or not using Logical OR-operator 
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
				|| ch == 'o' || ch == 'u') { // if any character matches above condition then print vowel
			System.out.println("'" + ch + "' is a vowel.");
		} else { // when if condition does not match print consonant
			System.out.println("'" + ch + "' is a consonant.");
		}

	}
}
