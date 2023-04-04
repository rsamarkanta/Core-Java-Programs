package com.ts.oops;

abstract class Animal {
	public abstract void sound();
}

class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("Dog barks...");
	}

}

class Lion extends Animal {

	@Override
	public void sound() {
		System.out.println("Lion roars...");
	}

}
