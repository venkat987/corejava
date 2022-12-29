package com.monika.branching;

public class ContinueDemo {
	public static void main(String[] arg) {
		for(int i = 5; i<=25; i+=5) {
			if(i==15) {
				continue; // continue skips the current iteration
			}
			System.out.println(i);
		}
	}
}
