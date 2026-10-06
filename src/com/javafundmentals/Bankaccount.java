package com.javafundmentals;

public class Bankaccount {
	static int balance=1000;
	static void deposit(int amount)
	{
		balance=balance+amount;
	}
	static void withdraw(int amount)
	{
		balance=balance-amount;
	}
	
	public static void main(String[] args) {
		deposit(500);
		withdraw(300);
		System.out.println("Finalbalance:"+balance);
	}

}
