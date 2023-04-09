package com.ts.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		// create a new HashMap employee<empId,empName>
		Map<Integer, String> employee = new HashMap<>();

		// add employee data
		employee.put(101, "Bikash");
		employee.put(102, "Ravi");
		employee.put(103, "Fatima");
		employee.put(104, "Rahul");
		employee.put(105, "Maya");
		employee.put(106, "Deepak");

		// print employee data
		System.out.println(employee);

		// update employee name
		employee.replace(104, "Dhanush");
		employee.replace(106, "Gaurav");

		// print employee HashMap
		System.out.println("\nIterating Hashmap...");
		System.out.println(" ID -- Name\n==========");
		for (Map.Entry<Integer, String> m : employee.entrySet()) {
			System.out.println(m.getKey() + " -- " + m.getValue());
		}

		// remove employee
		employee.remove(104);
		employee.remove(101, "Bikash");

		// print employee
		System.out.println(employee);

		// add more employee data
		employee.put(101, "Aswini");
		employee.put(102, "Swagat");
		employee.put(106, "Harish");
		employee.put(107, "Nilam");
		employee.put(104, "Komal");
		employee.put(108, "Maya");

		// print employee HashMap
		System.out.println("\nIterating Hashmap...");
		System.out.println(" ID -- Name\n==========");
		for (Map.Entry<Integer, String> m : employee.entrySet()) {
			System.out.println(m.getKey() + " -- " + m.getValue());
		}

		// find employee by Id
		System.out.println(employee.get(102));
		System.out.println(employee.get(106));

		// find key or value is available in Map or not
		System.out.println(employee.containsValue("Maya"));
		System.out.println(employee.containsKey(103));

		// print using toString()
		System.out.println(employee.toString());

		// check the map is empty or not
		System.out.println(employee.isEmpty());

		// clear all data from the map
		employee.clear();

		System.out.println(employee.isEmpty());
	}

}
