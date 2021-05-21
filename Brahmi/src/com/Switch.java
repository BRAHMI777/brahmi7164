package com;

public class Switch {

	public static void main(String[] args) {
		 int n=48,m;
		  if(n>=65)
		  { 
				  m=1;
		  }
		  else
		  {
			  if(n>=45 && n<65)
				  m=2;
			  else
			  {
				  if(n>=25 && n<45)
					  m=3;
				  else
					  m=4;
			  }
		  }
		  switch(m)
		  {
		  case 1:System.out.println("First class");
		  break;
		  case 2:System.out.println("Second class");
		  break;
		  case 3:System.out.println("Third class");
		  break;
		  case 4:System.out.println("Fail");
		  break;
		  default:System.out.println("Invalid case");
		  }

	}

}
