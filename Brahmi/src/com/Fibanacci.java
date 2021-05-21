package com;

public class Fibanacci {

	public static void main(String[] args) {
		int a=0,b=1,c,i;
		System.out.println(a);
		System.out.println(b);
		for(i=1;i<10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}

	}

}
