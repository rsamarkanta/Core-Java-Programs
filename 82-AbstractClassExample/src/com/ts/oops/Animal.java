package com.ts.oops;

abstract class Animal {

	Animal() {
		System.out.println("All animals...");
	}

	public abstract void sound();
}

class Dog extends Animal {

	public Dog() {
		super();
	}

	@Override
	public void sound() {
		System.out.println("Dog barks...");
	}

}

class Lion extends Animal {

	public Lion() {
		super();
	}

	@Override
	public void sound() {
		System.out.println("Lion roars...");
	}

}
