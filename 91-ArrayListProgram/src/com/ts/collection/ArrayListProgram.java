package com.ts.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {
	public static void main(String[] args) {

		// create a Student ArrayList
		List<String> student = new ArrayList<>();
		student.add("Bikash");
		student.add("Rahul");
		student.add("Priya");
		student.add("Bipin");
		student.add("Satya");
		student.add("Divyanka");
		student.add("Subrat");
		student.add("Maya");

		// print student ArrayList collection
		System.out.println(student);

		// update
		student.set(0, "Debasmita");
		student.set(3, "Swagat");
		student.set(5, "Ravi");

		// print student ArrayList collection
		System.out.println(student);

		// remove student using index number
		student.remove(2);
		student.remove(5);

		// print student ArrayList collection
		System.out.println(student);

		// find student using index no
		System.out.println(student.get(5));

		System.out.println("Student list is empty or not ? : " + student.isEmpty());

		// print student ArrayList collection using for-each loop
		for (String s : student) {
			System.out.println(s);
		}

		// to clear all the ArrayList data
		student.clear();

		// print student ArrayList collection
		System.out.println(student);

		System.out.println("Student list is empty or not ? : " + student.isEmpty());

		student.add("Meghna");
		student.add("Bhairav");
		student.add("Deepak");
		student.add("Meghna");
		student.add("Sindhu");
		student.add(4, "Gaurab");
		student.add(1, "Komal");

		// print hashcode of student ArrayList
		System.out.println(student.hashCode());

		// print using toString()
		System.out.println(student.toString());

		// convert student collection to Array ,will return a hashcode of student Array
		System.out.println(student.toArray());

		// create a subList from a List
		List<String> student2 = student.subList(2, 6);

		// print student2 List using for-each loop
		for (String s : student2) {
			System.out.print(s + " ,");
		}

		// we can remove all data using removeAll()
		student.removeAll(student);

		System.out.println("\nstudent is empty or not ? : " + student.isEmpty());
	}
}
