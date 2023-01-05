package com.monika;

public class AbstractClassDemo {
	public static void main(String[] arg) {
		DataBaseDemo d1 = new DataBaseDemo();
		d1.open();
		d1.connect();
		d1.close();
		
	}
}

abstract class DataBase {
	abstract void open(); //  abstract method
	abstract void connect(); // abstract method
	
	void close() { 			// non abstract method
		System.out.println("closed");
	}
}

class DataBaseDemo extends DataBase { // Concrete class where we are writing implementation

	@Override
	void open() {
		System.out.println("open");
	}

	@Override
	void connect() {
		System.out.println("connect");
	}
	               
	
}