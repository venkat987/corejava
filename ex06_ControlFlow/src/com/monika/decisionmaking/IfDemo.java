package com.monika.decisionmaking;

public class IfDemo {
	public static void main (String[] arg) {
		int a = 100;
		// if (expression or condition)
		if (a>50) {
			System.out.println("a>50");
		}
		if (a<50) {
			System.out.println("a<50");
		}
		System.out.println("end");
		
		if(a==10) System.out.println("a is 10");
		System.out.println("a is 100");
		
		
		if(a!=0) {
			System.out.println("a is not zero");
			if(a>50) {								// nested if statement
				System.out.println(a>50);
				
			}
			
		}
		
			
		
		
		
		
	}
}
