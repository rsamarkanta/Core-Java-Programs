package com.ts.pattern;

public class DiamondPattern {

	public static void main(String[] args) {
		int i, j, k;

		// Full Diamond program
		System.out.println("--------------Full Diamond Program-----------");
		// top part
		for (i = 1; i <= 5; i++) // i=1
		{
			for (j = 5; j > i; j--) // spaces,column
			{
				// print blank spaces
				System.out.print("  ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {
				// print *
				System.out.print("*");
			}
			System.out.println();// create a new line
		}

		// buttom part
		for (i = 4; i >= 1; i--) // rows
		{
			for (j = 5; j > i; j--) // spaces,column
			{
				// print blank spaces
				System.out.print("  ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {
				// print *
				System.out.print("*");
			}
			System.out.println();// create a new line
		}

		// Half Diamond program
		System.out.println("--------------Half Diamond Program-----------");
		// top part
		for (i = 1; i <= 5; i++) // i=1
		{
			for (j = 1; j <= i; j++) // spaces,column
			{
				// print blank spaces
				System.out.print("*  ");
			}
			System.out.println();// create a new line
		}
		
		//buttom part
		for (i = 1; i <= 4; i++) // i=1
		{
			for (j = 4; j >= i; j--) // spaces,column
			{
				// print blank spaces
				System.out.print("*  ");
			}
			System.out.println();// create a new line
		}
	}

}
