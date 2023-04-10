package com.ts.oops;

//A Student class which is a fully encapsulated class.  
//It has private data members and getter and setter methods.
class Student {
	// private data members
	private int roll;
	private String name;
	private String address;

	// public getter and setter methods
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

public class EncapsulationExamples {
	public static void main(String[] args) {

		// Create object
		Student st = new Student();

		// //setting values through setter methods
		st.setRoll(101);
		st.setName("Ramesh");
		st.setAddress("Pune");

		// getting values through getter methods
		System.out.println(
				" Roll no : " + st.getRoll() + "\n Name : " + st.getName() + "\n Address : " + st.getAddress());

	}
}
