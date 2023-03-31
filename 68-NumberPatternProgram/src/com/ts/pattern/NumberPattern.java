package com.ts.pattern;

public class NumberPattern {

	public static void main(String[] args) {
		int i, j, count = 0;
		// program 1
		System.out.println("--------------Program1--------------");
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				// print *
				System.out.print(j);
			}
			// to create a new line
			System.out.println();
		}

		System.out.println("--------------Program2--------------");
		// program 2
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				// print *
				System.out.print(i);
			}
			// to create a new line
			System.out.println();
		}

		System.out.println("--------------Program3--------------");
		// program 3
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				count++;
				// print *
				System.out.print(count+" ");
			}
			// to create a new line
			System.out.println();
		}
	}

}
