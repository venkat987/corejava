package com.monika.decisionmaking;

public class IfElseDemo {
	public static void main(String[] arg) {
		int x = 500;
		if (x>500) {
			System.out.println("x>500");
		} else {
			System.out.println("x!>500");
		}
		
		if(x>50) 
			System.out.println("x>50");
		else
			System.out.println("x<50");
		
		// nested if else
		
		if (x>=500) {
			System.out.println("x>=500");
			if(x>100) {
				System.out.println("x>100");
			} else {
				System.out.println("x!>100");
			}
		} else {
			System.out.println("x!=500");
		}
		
	}
}
