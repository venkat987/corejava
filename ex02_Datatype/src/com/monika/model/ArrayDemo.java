package com.monika.model;

public class ArrayDemo {
	 public static void main(String[] arg) {
		 // There are two type of array declaration
		 // Static Array can be defined like below
		 int[] a = {10,20,30,40,50,60};
		 System.out.println(a[0]);
		
		 // Dynamic Array can be defined like below
		 String[] names = new String[5]; 
		 names[0] = "Sai";
		 names[1] = "Dhakshith";
		 names[2] = "monika";
		 names[3] = "venkat";
		 names[4] = "Shakthi";
		 System.out.println(names[1]);
		
		 String[] cities = {"Scarborough","ontario","Toronto"};
		 System.out.println(cities[0]);
		 
	 }
	 
}
