package com.javafundmentals;

public class Main {
	static void method1() {
		System.out.println("static method1");
	}
	static void method2() {
		System.out.println("static method2");
	}
	static void method3() {
		System.out.println("static method3");
	}
	void method4() {
		System.out.println("instance method4");
	}
	void method5() {
		System.out.println("instance method5");
	}
	public static void main(String[] args) {
		method1();
		method2();
		method3();
		Main obj=new Main();
		obj.method4();
		obj.method5();



	} 

}
