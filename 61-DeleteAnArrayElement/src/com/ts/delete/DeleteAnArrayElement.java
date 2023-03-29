package com.ts.delete;

import java.util.Scanner;

public class DeleteAnArrayElement {

	public static void main(String[] args) {

		// declare variables
		int num[], size, index, num2[];
		Scanner sc = new Scanner(System.in);

		// input array size
		System.out.println("Enter size of Array : ");
		size = sc.nextInt();

		// initialize num[]
		num = new int[size];

		// take input for num[]
		System.out.println("Enter elements to Array : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		// print array elements
		System.out.println("Array elements are : ");
		for (int x : num)
			System.out.print(x + " ,");

		// take input for index to be deleted
		System.out.println("\n\nEnter index no of element to delete : ");
		index = sc.nextInt();

		// skip target index element and replace it by next element
		for (int i = index; i < size - 1; i++) {
			num[i] = num[i + 1];
		}

		// As we cann't reduce or increase array size from storage then
		// initialize another array with (size-1) and copy this array elements
		num2 = new int[size - 1];

		// copy num[] value to num2[] upto (size-1)
		for (int i = 0; i < size - 1; i++) {
			num2[i] = num[i];
		}

		// print num2[] value
		System.out.println("Array elements after delete are : ");
		for (int x : num2)
			System.out.print(x + " ,");
	}
}
