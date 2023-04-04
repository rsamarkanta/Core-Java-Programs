package com.ts.oops;

public class ConstructorOverloading {

	public static void main(String[] args) {
		// object for 3-param constructor
		Employee emp1 = new Employee();

		// object for 1-param constructor
		Employee emp2 = new Employee(101);

		// object for 2-param constructor
		Employee emp3 = new Employee("Rahul", 25000.0);

		System.out.println(emp1.empId + " " + emp1.empName + " " + emp1.empSalary);
		System.out.println(emp2.empId);
		System.out.println(emp3.empName + "  " + emp3.empSalary);

	}

}
