package com.java.variables;

public class Max {

	public static void main(String[] args) {
		int[] value1= {-2,10,30,5,60};
		int max=0;
		for(int value : value1)
		{
			if(value>max )
			{
				max=value;
			}
			System.out.println("max value is "+max);
		}
		
		System.out.println("max value is "+max);

	}

}
