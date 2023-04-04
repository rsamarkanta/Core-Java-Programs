package com.ts.string;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		// reverse method in StringBuffer and StringBuilder
		StringBuffer sbuffer = new StringBuffer("TechSamar");
		System.out.println(sbuffer.reverse());

		StringBuilder sbuilder = new StringBuilder("rsamarkanta");
		System.out.println(sbuilder.reverse());

		// append method to add strings
		sbuffer.append(" Java");
		System.out.println(sbuffer);

		// delete method
		sbuffer.delete(0, 10);
		System.out.println(sbuffer);

		// to find length
		System.out.println(sbuilder.length());

		// to create substring from a Stringbuilder
		String st = sbuilder.substring(5, 9);
		System.out.println(st);

	}

}
