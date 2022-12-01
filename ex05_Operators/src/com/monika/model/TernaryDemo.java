package com.monika.model;

public class TernaryDemo {
	public static void main(String[] arg) {
		int a = 200;
		int b = 500;
		String result = a>b ? "a is greater" : "b is greater ";
		System.out.println(result);
		
		// Type variable = condition ? true section : false section ;
		
		int c= a>b ? 1 : 2;
		System.out.println(c);
		
	}
}
