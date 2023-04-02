package com.ts.compare;

public class CompareTwoStrings {

	public static void main(String[] args) {

		String a = "lion";// string literal
		String b = "lion";
		String c = new String("lion");// new keyword

		System.out.println("comparing String a with b using == Operator and .equals()");
		if (a == b)
			System.out.println("True");
		else
			System.out.println("False");
		if (a.equals(b))
			System.out.println("True");
		else
			System.out.println("False");

		System.out.println("comparing String a with c using == Operator and .equals()");
		if (a == c)
			System.out.println("True");
		else
			System.out.println("False");

		if (a.equals(c))// due to String constant pool it become false
			System.out.println("True");
		else
			System.out.println("False");

		System.out.println("comparing String b with c using == Operator and .equals()");
		if (b == c)
			System.out.println("True");
		else
			System.out.println("False");

		if (b.equals(c))// due to String constant pool it become false
			System.out.println("True");
		else
			System.out.println("False");
	}

}
