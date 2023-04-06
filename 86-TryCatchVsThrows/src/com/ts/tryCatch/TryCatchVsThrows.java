package com.ts.tryCatch;

class TryCatchVsThrows {
	public static void test() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		try {
			test();
			System.out.println(10 / 0); // this will throw Arithmetic exception and
										// handle this execution using try...catch
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		System.out.println("Main method end...");
	}
}
