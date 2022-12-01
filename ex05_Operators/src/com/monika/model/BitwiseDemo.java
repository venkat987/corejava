package com.monika.model;

public class BitwiseDemo {
	public static void main (String[] arg) {
		int a  = 5;
		int b = 7;
		//8421
		//0101	
		//0111
		//0101 = 5
		System.out.println(a&b); // AND operator//
		
		//8421
		//0101
		//0111
		//0111 = 7 
		System.out.println(a|b); // OR operator//
		
		//8421
		//0101
		//0111
		//0010 = 2
		System.out.println(a^b); // XOR operator//
		
	}
}
