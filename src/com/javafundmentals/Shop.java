package com.javafundmentals;

public class Shop {
	static int money = 450;
	 static int choclateprice =15;
	static  int cookieprice=10;
	static  int chocolatequantity=10;
	 static int cookiequantiy=5;
	
	 
	

	public static void main(String[] args) {
	
		 int choclatesprice = chocolatequantity*choclateprice;
		 int cookies = cookiequantiy*cookieprice;
		 int spent=choclatesprice+cookies;
		 int total=money-spent;
		 System.out.println(choclatesprice );
		 System.out.println(cookies );
		 System.out.println(total);
		 
	}

}
