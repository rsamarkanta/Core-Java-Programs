package com.ts.interfaceExamples;

public class ExtendingInterfaceTest {

	public static void main(String[] args) {
		// we can get only Addition interface methods
		Addition add = new Calculator();
		add.add();

		// we will get super interface methods also
		Subtraction sub = new Calculator();
		sub.add();
		sub.sub();

	}

}
