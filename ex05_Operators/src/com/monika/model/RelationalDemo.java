package com.monika.model;

public class RelationalDemo {
	public static void main(String[] arg) {
		int a = 500;
		int b = 700;
		
		System.out.println(a>b);
		System.out.println(a<b);
		
		int c = 700;
		System.out.println(c<=b);
		System.out.println(c>=b);
		System.out.println("----------------------");
		
		String color = "White";
		Object obj = color;
		System.out.println(obj instanceof Integer);
		System.out.println(obj instanceof String);
		
		
	}
}
