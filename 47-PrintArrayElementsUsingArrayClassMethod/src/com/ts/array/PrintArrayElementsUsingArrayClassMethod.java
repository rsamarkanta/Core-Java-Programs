package com.ts.array;

import java.util.Arrays;

public class PrintArrayElementsUsingArrayClassMethod {

	public static void main(String[] args) {
		String[] st = { "Siva", "Raghu", "Bibhu", "Ravi" };
			
		System.out.println("Using toString() : " + Arrays.toString(st));

		System.out.println("Using asList() : " + Arrays.asList(st));
		
		int arr[][] = { { 10, 25 }, { 32, 48 } };
		System.out.println("Using deeptoString() : " + Arrays.deepToString(arr));
	}

}
