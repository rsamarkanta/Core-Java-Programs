package com.ts.oops;

public class Employee {

	int empId;
	String empName;
	double empSalary;
	

	// 3-param constructor
	Employee() {
		empId = 100;
		empName = "Samar";
		empSalary = 1000.2;
	}

	// 1-param constructor
	Employee(int x) {
		empId = x;
	}

	// 2-param constructor
	Employee(String y, double z) {
		empName = y;
		empSalary = z;
	}
	
}
