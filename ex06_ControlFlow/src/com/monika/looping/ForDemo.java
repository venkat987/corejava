package com.monika.looping;

public class ForDemo {
	public static void main(String[] arg) {
		// for(initialization; condition; increment or decrement)
		for(int i = 0; i<4; i++) {
			System.out.println(i);
		}
		for(int i = 0, j = 3; i<4 && j>0; i++,j-- ) {
			System.out.println(i+","+j);
		}
		for(;;) { 						// infinite for loop
			System.out.println("Hello");
		}
			
	}
	
} 
