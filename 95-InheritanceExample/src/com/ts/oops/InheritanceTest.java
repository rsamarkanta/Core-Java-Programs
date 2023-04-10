package com.ts.oops;

//base class
class Animal {
	public void eat() {
		System.out.println("Animal can eat.");
	}
}

//Derived class  inheriting properties of Base class
class Dog extends Animal {

	public void sound() {
		System.out.println("Dog can bark. ");
	}
}

//main class
public class InheritanceTest {
	public static void main(String[] args) {

		Animal a = new Animal(); // creating Animal object

		a.eat();// print Animal class Method

		Dog d = new Dog(); // creating Dog object

		d.eat(); // print Animal Class Method

		d.sound(); // print Dog Class Method

	}

}
