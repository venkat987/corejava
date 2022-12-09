package com.monika.decisionmaking;
		
public class SwitchDemo {
	public static void main(String[] arg) {
		int a = 50;
		switch(a) {		// switch (option) - option can be either int or char or string type
		case 20:
			System.out.println("value is 20");
			break;
		case 50:
			System.out.println("value is 50");
			break;
		case 100:
			System.out.println("value is 100");
			break;
			
		}
		System.out.println("-----------------------");
		
		char x = 'i';
		switch(x) {
		case 'a':
		case 'b':
		case 'c':
			System.out.println("a to c");
			//break;
		case 'i':
		case 'j':
		case 'k':
			System.out.println("i to k");
			break;
		default:
			System.out.println("not between a to c & i to k");
			break;
				
		}
		/*float m = 59f;
		switch(m) { 	// float is not supported for switch 
		
		}*/
	}
}
