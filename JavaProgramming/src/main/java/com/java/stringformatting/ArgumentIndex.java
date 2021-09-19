package com.java.stringformatting;

public class ArgumentIndex {

	public static void main(String[] args) {
		int valA=100, valB=200, valC=300;
		
System.out.printf("%3$d %1$d %2$d \n", valA, valB, valC);

System.out.printf("%3$d %<d %2$d", valA, valB, valC);

	}

}
