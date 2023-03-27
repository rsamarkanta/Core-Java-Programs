package com.ts.copy;

import java.util.Scanner;

public class CopyAllElementsOfOneArrayToAnother {

	public static void main(String[] args) {
		// declare two arrays
		int arr1[], arr2[], size;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first Array :  ");
		size = sc.nextInt();

		// intialize array size
		arr1 = new int[size];
		arr2 = new int[arr1.length];

		// take input to first array
		System.out.println("Input elements to first array : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("-----------------------------------------");
		// print elements of arr1
		System.out.println("Elements of First Array : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ", ");
		}

		// copy elements of arr1 to arr2
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		System.out.println("\n-----------------------------------------");
		// print elements of arr2
		System.out.println("Elements of Second Array : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ", ");
		}
	}

}
