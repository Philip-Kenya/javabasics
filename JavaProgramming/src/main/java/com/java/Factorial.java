package com.java;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0, factorial=1;
		if(n!=0) {
			for(int i=1; i<=n; i++)
			{
				factorial= factorial*i;
			}
		}
		else
		{
			factorial=1;
		}

		System.out.println("factorial is "+factorial);
	}

}
