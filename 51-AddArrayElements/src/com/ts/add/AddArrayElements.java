package com.ts.add;

import java.util.Scanner;

public class AddArrayElements {

	public static void main(String[] args) {
		// declare an array and size
		int arr[], size, sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Array : ");
		size = sc.nextInt();

		arr = new int[size];

		// input array elements
		System.out.println("Enter elements to array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// print elements of array
		System.out.println("Array elements are : ");
		for (int x : arr)
			System.out.print(x + " ,");

		// calculate sum
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		// print sum
		System.out.println("\nSum of the Array elements is : " + sum);
	}

}
