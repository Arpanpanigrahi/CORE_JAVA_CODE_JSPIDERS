package com.jsp.basic;

public class Decimal_To_Binary {
	public static void main(String[] args) {
		int n = 47;
		int bin = 0;
		int i = 1;
		while(n>=1)
		{
			int rem=n%2;
			bin+=(rem*i);
			i*=10;
			n/=2;
		}
		System.out.println(bin);
	}
}
