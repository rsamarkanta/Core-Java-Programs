package com.ts.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

	public static void main(String[] args) {

		// create a set
		Set<String> fruit = new HashSet<>();

		// add fruit names to Set collection
		fruit.add("Mango");
		fruit.add("Strawberry");
		fruit.add("Guava");
		fruit.add("Banana");
		fruit.add("Strawberry");
		fruit.add("Jackfruit");
		fruit.add("Grapes");

		// print fruit Set
		System.out.println(fruit);

		// check for an element is available in Set or not
		System.out.println(fruit.contains("Mango"));

		// remove element from Set
		fruit.remove("Mango");

		// print size of Set
		System.out.println(fruit.size());

		// print Set using for-each loop
		for (String f : fruit) {
			System.out.print(f + " ,");
		}

		// add more data to Set
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("Grapes");

		System.out.println("\n" + fruit);

		// clear all data from Set
		fruit.clear();

		// print fruit Set
		System.out.println("\n" + fruit);

		// check Set is empty or not
		System.out.println(fruit.isEmpty());

		fruit.add("kiwi");
		fruit.add("Pomogranate");
		fruit.add("Dragon Fruit");

		// print fruit Set
		System.out.println(fruit);

	}

}
