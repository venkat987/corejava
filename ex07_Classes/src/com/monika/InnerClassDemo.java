package com.monika;

public class InnerClassDemo {
	public static void main(String[]arg) {
		College.Student stu1 = new College(). new Student();
		stu1.display();
		
		College.Staff Stf1  = new College(). new Staff();
		Stf1.display();
	}
}

class College {
	class Student {
		void display() {
			System.out.println("Student");
		}
		
	}
	class Staff{
		void display() {
			System.out.println("Staff");
		}
	}
}
