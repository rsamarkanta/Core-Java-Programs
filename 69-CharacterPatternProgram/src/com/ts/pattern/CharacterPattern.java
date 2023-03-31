package com.ts.pattern;

public class CharacterPattern {

	public static void main(String[] args) {
		char i, j, count = 'A';
		// program 1
		System.out.println("----------------Program 1-------------");
		for (i = 'A'; i <= 'E'; i++) {// rows
			for (j = 'A'; j <= i; j++) {// columns
				// print
				System.out.print(j + " ");
			}
			// to create a new line
			System.out.println();
		}

		// program 2
		System.out.println("----------------Program 2-------------");
		for (i = 'A'; i <= 'E'; i++) {// rows
			for (j = 'A'; j <= i; j++) {// columns
				// print
				System.out.print(i + " ");
			}
			// to create a new line
			System.out.println();
		}

		// program 3
		System.out.println("----------------Program 3-------------");
		for (i = 'A'; i <= 'F'; i++) {// rows
			for (j = 'A'; j <= i; j++) {// columns
				// print
				System.out.print(count + " ");
				count++;
			}
			// to create a new line
			System.out.println();
		}
	}

}
