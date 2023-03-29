package com.ts.find;

import java.util.Scanner;

public class FindSmallestElementInArray {

	public static void main(String[] args) {
		// declare variables
		int num[], size, min;

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

		// let num[0] is smallest
		min = num[0];

		// compare num[0] with every array elements and find the smallest
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min)
				min = num[i];
		}

		// print the smallest element
		System.out.println("\nSmallest element in Array is : " + min);
	}

}
