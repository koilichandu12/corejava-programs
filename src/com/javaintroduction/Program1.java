package com.javaintroduction;
 class Program
{
		
	    static int count = 0;

	    Program() {
	        count++;
	    }
}

	   public class Program1 {
	    public static void main(String[] args) {

	        Program p1 = new Program();
	        Program p2  = new Program();
	      
	        System.out.println("Total number of objects created: " + Program.count);
	    }
  }


