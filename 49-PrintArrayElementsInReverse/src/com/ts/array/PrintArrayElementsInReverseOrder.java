package com.ts.array;

import java.util.Scanner;

public class PrintArrayElementsInReverseOrder {

	public static void main(String[] args) {
		int size, num[];
		Scanner sc = new Scanner(System.in);

		// input array size
		System.out.println("Enter size of array : ");
		size = sc.nextInt();

		num = new int[size];

		// input elements to array
		System.out.println("Enter " + size + " elements to array : ");
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}

		// print Array elements in reverse order
		System.out.println("Array elements  in reverse order : ");
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " , ");
		}
	}

}
