package com.ts.pattern;

public class StarPattern2 {

	public static void main(String[] args) {
		int i, j, k;
		for (i = 1; i <= 5; i++) // rows
		{
			for (j = i; j < 5; j++) // spaces
			{
				// print blank spaces
				System.out.print("  ");
			}
			for (k = 1; k <= i; k++) // columns
			{
				// print *
				System.out.print("*");
			}
			System.out.println();// create a new line
		}
	}

}
