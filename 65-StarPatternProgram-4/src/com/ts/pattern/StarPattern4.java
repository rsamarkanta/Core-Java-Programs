package com.ts.pattern;

public class StarPattern4 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {// rows
			for (j = 1; j <= 5; j++) {// columns
				// print *
				if (i == 1 || i == 5 || j == 1 || j == 5)
					System.out.print("*");
				else
					System.out.print("  ");
			}
			// to create a new line
			System.out.println();
		}
	}

}
