package com.monika;

public class StaticClassDemo {
	public static void main(String[] arg) {
	 	Hotel.Veg v1 = new Hotel.Veg();
	 	v1.kitchen();
	 	
	}
}

class Hotel{
	static class Veg{
		void kitchen() {
			System.out.println("Veg");
		}
	}
}