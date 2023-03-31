package com.ts.pattern;

public class StarPattern3 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 6; i++) {// rows
			for (j = 1; j <= 6; j++) {// columns
				// print *
				System.out.print("*");
			}
			// to create a new line
			System.out.println();
		}
	}

}
