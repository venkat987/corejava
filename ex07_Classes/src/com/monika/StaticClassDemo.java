package com.monika;

public class StaticClassDemo {
	public static void main(String[] arg) {
	 	Hotel.Veg v1 = new Hotel.Veg();
	 	v1.kitchen();
	 	
	 	Marks.Maths m1 = new Marks.Maths();
	 	m1.maths();
	}
	
}

class Hotel{
	static class Veg{
		void kitchen() {
			System.out.println("Veg");
		}
	}
}
class Marks{
	static class Maths{
		void maths() {
			int m = 40;
			if (m>=40) {
			System.out.println("pass =" + m);
			} else {
				System.out.println("fail");
			  }
			do {
				System.out.println("fail");
			} while(m<40);
			m--;
			}
			}
		}
	
