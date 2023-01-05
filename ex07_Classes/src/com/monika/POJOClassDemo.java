package com.monika;

public class POJOClassDemo {
	public static void main(String[] arg) {
		Student s1 = new Student();
		s1.setName("Monika");
		s1.setAge(30);
		s1.setRollnumber(24);
		s1.setGender('F');
		/*
		 * System.out.println(s1.getName()); System.out.println(s1.getAge());
		 * System.out.println(s1.getGender()); System.out.println(s1.getRollnumber());
		 */
		System.out.println(s1);
	}
}

class Student {
	private String name;
	private int age;
	private int rollnumber;
	private char gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollnumber=" + rollnumber + ", gender=" + gender + "]";
	}
}