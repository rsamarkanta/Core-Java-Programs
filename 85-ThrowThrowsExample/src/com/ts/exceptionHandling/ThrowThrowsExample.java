package com.ts.exceptionHandling;

public class ThrowThrowsExample {

	void div(int a, int b) throws ArithmeticException { // throws uses for handle exception by caller method or JVM
		if (b == 0) {
			throw new ArithmeticException(); // throw uses for explicitly throw any exception
		} else {
			int c = a / b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		ThrowThrowsExample t = new ThrowThrowsExample();
		// handle exception using try...catch
		try {
			t.div(12, 0);
		} catch (ArithmeticException e) {
			System.out.println("The value of b is '0' .");
		}
	}

}
