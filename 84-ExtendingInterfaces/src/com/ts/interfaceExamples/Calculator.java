package com.ts.interfaceExamples;

//implementing interfaces
public class Calculator implements Subtraction {

	@Override
	public void add() {
		System.out.println("Calculator.add()");
		int a = 53, b = 32, c;
		c = a + b;
		System.out.println("Addition : " + a + "+" + b + " = " + c);
	}

	@Override
	public void sub() {
		System.out.println("Calculator.sub()");
		int a = 53, b = 32, c;
		c = a - b;
		System.out.println("Subtraction : " + a + "-" + b + " = " + c);

	}

}
