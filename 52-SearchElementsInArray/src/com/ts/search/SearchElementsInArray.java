package com.ts.search;

import java.util.Scanner;

public class SearchElementsInArray {

	public static void main(String[] args) {
		int arr[], size, num, count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of the array : ");
		size = sc.nextInt();

		arr = new int[size];

		// input array elements
		System.out.println("Enter elements to array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// enter element for searching
		System.out.println("Enter number for searching : ");
		num = sc.nextInt();

		// search elements in array
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i])
				count++;
		}

		// print if number found
		if (count >= 1)
			System.out.println("Number found " + count + " times.");
		else
			System.out.println("Number not found...");

	}
}
