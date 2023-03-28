package com.ts.array;

import java.util.Arrays;
import java.util.Scanner;

public class PredefinedArrayClassMethods {

	public static void main(String[] args) {
		// declaring array variables
		int arr[], arr2[], arr3[], size;
		Scanner sc = new Scanner(System.in);

		// Enter size of the array
		System.out.println("Enter size of array : ");
		size = sc.nextInt();

		// initialize array
		arr = new int[size];
		arr2 = new int[size];
		arr3 = new int[size];

		// input elements to 1st array
		System.out.println("Enter elements to first array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// input elements to 2nd array
		System.out.println("Enter elements to second array : ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		// print first array elements
		System.out.println("First Array elements are : ");
		for (int x : arr)
			System.out.print(x + " ,");

		System.out.println("\n-----------------------------------------------------------------");
		// print second array elements
		System.out.println("\nSecond Array elements are : ");
		for (int x : arr2)
			System.out.print(x + " ,");

		System.out.println("\n-----------------------------------------------------------------");
		// check equality for two arrays
		boolean b;
		b = Arrays.equals(arr, arr2);
		if (b)
			System.out.println("\nTwo arrays are same...");
		else
			System.out.println("\nTwo arrays are not same...");

		// sorting array using predefined method
		Arrays.parallelSort(arr);

		System.out.println("\n-----------------------------------------------------------------");
		// Print array elements after sorting
		System.out.println("\nFirst Array elements after sorting are : ");
		for (int x : arr)
			System.out.print(x + " ,");

		// Sort array in ascending order
		Arrays.sort(arr2);

		System.out.println("\n-----------------------------------------------------------------");
		// print array elements
		System.out.println("\nSecond Array elements after sorting are : ");
		for (int x : arr2)
			System.out.print(x + " ,");

		// copy of array elements of arr2 to arr3
		arr3 = Arrays.copyOf(arr2, size);
		System.out.println("\n-----------------------------------------------------------------");
		System.out.println("Second array elements are copied to third array elements...");

		System.out.println("\n-----------------------------------------------------------------");
		// print array elements
		System.out.println("\nThird Array elements are : ");
		for (int x : arr3)
			System.out.print(x + " ,");

		System.out.println("\n-----------------------------------------------------------------");
		// check equality for two arrays
		b = Arrays.equals(arr2, arr3);
		if (b)
			System.out.println("\nTwo arrays are same...");
		else
			System.out.println("\nTwo arrays are not same...");

	}

}
