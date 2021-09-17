package com.calc.engine;

public class CalcEngine {

	public static void main(String[] args) {
		double value1=100.0;
		double value2=3;
		double result=0.0;
		char opCode ='d';

		switch (opCode) {
		case 'a':
			result = value1 + value2;
			break;
		case 's':
			result = value1 - value2;
			break;	
		case 'm':
			result = value1 * value2;
			break;	
		case 'd':
			result = value1 * value2;
			if (value2!=0) {
				result = value1 / value2;
				System.out.println(result);
			}
			break;	
		default:
			System.out.println("invalid opCode");
			result=0.0d;
			break;
		}
		System.out.println(result);
	}

}
