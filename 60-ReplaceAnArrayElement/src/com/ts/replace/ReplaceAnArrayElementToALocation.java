package com.ts.replace;

import java.util.Scanner;

public class ReplaceAnArrayElementToALocation {

	public static void main(String[] args) {
		// declare variables
		int num[], size, index, item;

		Scanner sc = new Scanner(System.in);

		// take input array size
		System.out.println("Enter size of array : ");
		size = sc.nextInt();

		// initialize array
		num = new int[size];

		// take input for Array
		System.out.println("Input array elements : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		// print array elements
		System.out.println("Array elements are : ");
		for (int x : num)
			System.out.print(x + " ,");

		// take input of array index to replace
		System.out.println("\n\nEnter an array index for replacing an element :");
		index = sc.nextInt();

		// take input for new element to replace
		System.out.println("Enter the new item : ");
		item = sc.nextInt();

		// reduce array size and remove element
		for (int i = 0; i > index; i--) {
			num[i] = num[i - 1];
		}

		// replace new element to old index
		num[index] = item;

		// increase
		size++;

		// print array elements after replacing
		System.out.println("Array elements after replacing are : ");
		for (int x : num)
			System.out.print(x + " ,");

	}

}
