package comm.ts.check;

import java.util.Scanner;

public class CheckNumberDivisibility {

	public static void main(String[] args) {
		int num, div;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		num = sc.nextInt();
		System.out.print("Enter divisor : ");
		div = sc.nextInt();
		// check for divisibility
		if (num % div == 0)
			System.out.println(num + " is divisible by " + div);
		else
			System.out.println(num + " is not divisible by " + div);
	}

}
