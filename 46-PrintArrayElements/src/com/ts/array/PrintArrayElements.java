package com.ts.array;

public class PrintArrayElements {

	public static void main(String[] args) {
		// declaring an array with size=5;
		int[] num = new int[5];

		// initializing array variables using 0-based index
		num[0] = 24;
		num[1] = 65;
		num[2] = 39;
		num[3] = 15;
		num[4] = 48;

		// get the array value using using index with for loop
		System.out.print("Using for loop : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		// get the array value by iterating with for each loop
		System.out.print("\nUsing for-each loop : ");
		for (int a : num)
			System.out.print(a + " ");
	}

}
