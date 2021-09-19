package com.java.stringformatting;

public class widthFormat {

	public static void main(String[] args) {
		int w=5, x=235, y=481, z=12;
		System.out.printf("W:%04d X:%04d \n", w,x);
		
		System.out.printf("Y:%-4d Z:%-4d", y,z);

	}

}
