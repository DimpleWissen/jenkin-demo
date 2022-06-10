package com;

public class Calculator {
	
	static public int add(int a, int b) {
		return a+b;
	}
	
	static public int sub(int a, int b) {
		System.out.println("Hello jenkins");
		return a-b;
	}
	
	public static void main(String args[]) {
		
		System.out.println(add(10,20));
		sub(30,10);
		System.out.println("In main");
	}

}
