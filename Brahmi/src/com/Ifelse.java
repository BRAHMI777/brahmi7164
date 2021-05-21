package com;

public class Ifelse {

	public static void main(String[] args) {
		  int n=48;
		  if(n>=65)
		  { 
				  System.out.println("First class");
		  }
		  else
		  {
			  if(n>=45 && n<65)
				  System.out.println("Second class");
			  else
			  {
				  if(n>=25 && n<45)
					  System.out.println("Third class");
				  else
					  System.out.println("Fail");
			  }
		  }

	}

}
