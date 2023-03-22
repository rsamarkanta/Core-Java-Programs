package com.ts.print;

public class PrintAlphabets {

	public static void main(String[] args) {
		System.out.println("Upper case alphabets :");
		// Print alphabets from A to Z
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");
		}
		System.out.println("\nLower case alphabets :");
		// Print alphabets from a to z
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}
	}
}
