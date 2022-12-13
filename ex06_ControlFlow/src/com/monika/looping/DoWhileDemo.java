package com.monika.looping;

public class DoWhileDemo {
	public static void main(String[] arg) {
		int a = 0;
		do {
			System.out.println("HEllo");	
		} while(a>0);
		// Exit controlled loop
		do {
			System.out.println(a);
			a++;
		} while(a<5);
	}
}
