package com.ts.find;

import java.util.Scanner;

public class FindFactorsOfNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		num = sc.nextInt();
		if (num == 0)
			System.out.println("0");
		//find factors of num
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.print(i + ", ");
		}
	}

}
