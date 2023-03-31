package com.ts.matrix;

import java.util.Scanner;

public class PrintTransposeOfMatrix {

	public static void main(String[] args) {

		// Declare variable
		int a[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);

		// take input for Matrix
		System.out.println(" Enter matrix Data : ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// print Matrix
		System.out.println("\nPrint Matrix :");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// print Mirror of Matrix
		System.out.println("\nMirror of Matrix:  ");
		for (int i = 0; i < 2; i++) {
			for (int j = 1; j >= 0; j--) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
