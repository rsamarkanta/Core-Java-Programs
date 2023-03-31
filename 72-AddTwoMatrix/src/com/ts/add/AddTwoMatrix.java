package com.ts.add;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {

		// Declare variable
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);

		// take input for First Matrix
		System.out.println(" Enter first matrix Data : ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		// take input for Second Matrix
		System.out.println(" Enter first matrix Data : ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		// print First Matrix
		System.out.println("\nPrint First Array :");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// print Second Matrix
		System.out.println("\nPrint Second array :  ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		// Add two matrix
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		// Print after adding
		System.out.println("\nAfter adding both Array :");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
