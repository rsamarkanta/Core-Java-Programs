package com.ts.calc;

import java.util.Scanner;

public class CalculateAvarageOfArrayElements {

	public static void main(String[] args) {
		// declare an array
		int arr[], size, sum = 0, avg;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of the array : ");
		size = sc.nextInt();

		// initialize array
		arr = new int[size];

		// input array elements
		System.out.println("Enter elements to array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// calculate sum elements in array
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		// calculate average of array elements
		avg = sum / arr.length;

		// print average
		System.out.println("Average : " + avg);
	}
}
