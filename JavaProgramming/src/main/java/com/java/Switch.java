package com.java;

public class Switch {

	public static void main(String[] args) {
		char opCode = 's';
		int value1=40, value2=20, result=0;
		switch (opCode) {
		case 's':
			result= value1-value2;
			System.out.println(result);
			
			break;
		case 'a':
			result= value1+value2;
			System.out.println(result);
			
			break;

		default:
			System.out.println("wrong input opCode");
			break;
		}
		
	}

}
