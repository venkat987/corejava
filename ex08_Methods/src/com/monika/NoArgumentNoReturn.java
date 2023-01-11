package com.monika;

public class NoArgumentNoReturn {
	public void display(){
		System.out.println("No Argument & No Return");
	}
	public static void main(String[] arg) {
		NoArgumentNoReturn n1 = new NoArgumentNoReturn();
		n1.display();
	}
}
