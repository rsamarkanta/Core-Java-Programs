package com.ts.compare;

import java.util.Arrays;

public class Comparison {

	public static void main(String[] args) {
		int arr[] = { 12, 35, 235, 89, 20, 73, 82 };
		int arr2[] = { 12, 35, 235, 89, 20, 73, 82 };

		// check equality for reference
		if (arr == arr2)
			System.out.println("Both are equal...\n");
		else
			System.out.println("Both are not equal...\n");

		// check equality for contents using Array class methods
		if (Arrays.equals(arr, arr2))
			System.out.println("Both are equal...\n");
		else
			System.out.println("Both are not equal...\n");

	}

}
