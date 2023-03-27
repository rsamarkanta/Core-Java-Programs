package com.ts.array;

import java.util.Scanner;

public class FindLengthOfArray {

	public static void main(String[] args) {
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);

		// input array elements
		System.out.println("Input elements to array :");
		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
		}

		// print array elements
		System.out.println("Array Elements are : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " , ");
		}

		// print length of array
		System.out.println("\nLength of the array is : " + num.length);
	}

}
