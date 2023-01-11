package com.monika;

public class WithArgumentNoReturn {
	public void display(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] arg) {
		WithArgumentNoReturn w1 = new WithArgumentNoReturn();
		w1.display("hello");
		w1.display("Monika");
	}
	
}
