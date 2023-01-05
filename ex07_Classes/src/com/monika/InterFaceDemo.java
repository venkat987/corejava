package com.monika;

public class InterFaceDemo {
	
	// interface ( example man and machine , between 
	public static void main(String[] arg) {
		Cascio c1 = new Cascio();
		c1.add();
		c1.print();
		c1.sound();
		System.out.println(c1.price);
	}
}

interface Calculator{
	int price = 100; // By default its final  
	void add();
	void print();
}

class Cascio implements Calculator { // Concrete class where we are writing implementation
	@Override
	public void add() {
		System.out.println("Adding");
	}
	@Override
	public void print() {
		System.out.println("Printing");
	}
	public void sound() {
		System.out.println("Beep");
	}
}