package com.javafundmentals;

public class Arthmeticoperations {
	private int addition(int a,int b) {
		int c=a+b;
		return c;
		
	}
	public int sub(int a,int b) {
		int c=a-b;
		return c;
	}	
	public int multiply(int a,int b) {
		int c=a *b;
		return c;
	}	
	public int div(int a,int b) {
		int c=a/b;
		return c;
	}	
	public static void main(String[] args) {
		Arthmeticoperations ac=new Arthmeticoperations();
		int result = ac.addition(10,5);
		System.out.println(result);
		int result1 = ac.sub(120,5);
		System.out.println(result1);
		int result2 = ac.multiply(1000,5);
		System.out.println(result2);
		int result3= ac.div(80,5);
		System.out.println(result3);
			}
}
