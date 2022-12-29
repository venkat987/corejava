package com.monika.branching;

public class BreakDemo {
	public static void main(String[] arg) {
		for(int a = 0; a<5; ++a) {
			System.out.println(a);
			if(a==3) {
				break; // break is the statement to break the loop
			}
		}
	}
}
