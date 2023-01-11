package com.monika;

public class NoArgumentWithReturn {
	public int hundered() {
		return 100;
	}
	public String greet() {
		return "love";
	}
	public static void main(String[] arg) {
		NoArgumentWithReturn n1 = new NoArgumentWithReturn();
		int h = n1.hundered();
		System.out.println(h);
		System.out.println(n1.hundered());
		
		
		String m = n1.greet();
		System.out.println(m);
		System.out.println(n1.greet());
		
	}
}
