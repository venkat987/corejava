package com.monika;

public class WithArgumentWithReturn {
	public int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] arg) {
		WithArgumentWithReturn w1 = new WithArgumentWithReturn();
		
		int t = w1.add(20, 30);
		System.out.println(t);
		
		System.out.println(w1.add(50, 50));
		
	}
}
