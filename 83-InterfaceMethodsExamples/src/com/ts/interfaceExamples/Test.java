package com.ts.interfaceExamples;

public class Test {

	public static void main(String[] args) {

		// we can call all the implemented methods by sub-class object
		// as we extends the super classes
		CompuTech ct = new CompuTech();

		// super class method
		ct.webDesign();

		// this class method
		ct.webDevelope();
	}

}
