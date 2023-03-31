package com.ts.pattern;

public class StarPattern1 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				// print *
				System.out.print("*");
			}
			// to create a new line
			System.out.println();
		}
	}

}
