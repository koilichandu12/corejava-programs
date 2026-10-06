package com.javafundmentals;

public class Void {
	String sname="chandu";
	int rollnum=101;
	String course="jfs";
	
	int marks1=80;
	int marks2=90;
	int marks3=100;
	void displayStudentdetails() {
		System.out.println(sname);
		System.out.println(rollnum);
		System.out.println(course);
		}
	void calculatetotal() {
		int total=marks1+marks2+marks3;
		System.out.println("totalmarks:"+total);
		}
	void calculateaverage() {
		double avg=(marks1+marks2+marks3)/3;
		System.out.println("Averagemarks:"+avg);
		}
	public static void main(String[] args) {
		Void v=new Void();
		v.displayStudentdetails();
		v.calculatetotal();
		v.calculateaverage();	
	}
}
