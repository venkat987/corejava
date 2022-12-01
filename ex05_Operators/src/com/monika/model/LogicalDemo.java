package com.monika.model;

public class LogicalDemo {
	public static void main (String[] arg) {
		int a = 90;
		int b = 30;
		// && check all the condition must be true//
		boolean x = a>50 && b<50;
		System.out.println(x);
		
		boolean y = a>50 && b>50;
		System.out.println(y);
		
		// || any one must be true //
		boolean i = a>50 || b>50;
		System.out.println(i);
		
		boolean j = a<50 || b<50 || b<40;
		System.out.println(j);
		
	}
}
