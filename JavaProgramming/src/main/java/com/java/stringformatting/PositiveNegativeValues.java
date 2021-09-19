package com.java.stringformatting;

public class PositiveNegativeValues {

	public static void main(String[] args) {
		int iPosVal=123, iNegVal=-456;
		System.out.printf("%d \n", iPosVal);
		System.out.printf("%d \n", iNegVal);
		
		System.out.printf("% d \n", iPosVal);
		System.out.printf("% d \n", iNegVal);
		

		System.out.printf("%+d \n", iPosVal);
		System.out.printf("%+d \n", iNegVal);


		System.out.printf("%(d \n", iPosVal);
		System.out.printf("%(d \n", iNegVal);
		System.out.printf("% (d \n", iPosVal);
	}

}
