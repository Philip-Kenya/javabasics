package com.calc.engine;

public class CalcEngine {

	public static void main(String[] args) {
		double value1=100.0;
		double value2=0;
		double result=0.0;
		char opCode ='d';
		
		if (opCode =='a')
		{
			result = value1 + value2;
			
		}
		else if (opCode =='s')
		{
			result = value1 - value2;
			
		}
		else	if (opCode =='m')
		{
			result = value1 * value2;
			
		}
		else if (opCode =='d')
		{
			if (value2!=0) {
				result = value1 / value2;
			}
			
			
		}
		else
		{
			System.out.println("invalid opCode");
			result=0.0d;
		
		}
		
		
		System.out.println(result);

	}

}
