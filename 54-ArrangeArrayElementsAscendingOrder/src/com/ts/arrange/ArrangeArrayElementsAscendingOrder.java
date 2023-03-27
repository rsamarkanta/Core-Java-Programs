package com.ts.arrange;

import java.util.Scanner;

public class ArrangeArrayElementsAscendingOrder {

	public static void main(String[] args) {
		int arr[], size, temp = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array : ");
		size = sc.nextInt();

		// initialize array
		arr = new int[size];

		// Input elements to array
		System.out.println("Enter elements into array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// print array elements before arrange
		System.out.println("array elements before arrange : ");
		for (int x : arr)
			System.out.print(x + " ,");

		// arrange in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// print array elements before arrange
		System.out.println("\narray elements after arrange : ");
		for (int x : arr)
			System.out.print(x + " ,");

	}

}
