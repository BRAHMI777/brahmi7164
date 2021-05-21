package com;

public class Reverse {

	public static void main(String[] args) {
		int n=123,n1=0;
		while(n)
		{
			n1=(n1*10)+(n%10);
			n/=10;
		}
		System.out.println(n1);
	}

}
