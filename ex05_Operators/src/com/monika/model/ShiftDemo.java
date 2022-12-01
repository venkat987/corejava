package com.monika.model;

public class ShiftDemo {
	/*	8	4	2	1 (hexa decimal)
		1	0	0	0
		0	0	0	1		*/
	public static void main(String[] arg) {
		int a = 8;
		System.out.println(a);
		
		System.out.println(a>>1);
		System.out.println(a>>2);
		
		a = 1;
		System.out.println(a<<1);
		
	}
}
