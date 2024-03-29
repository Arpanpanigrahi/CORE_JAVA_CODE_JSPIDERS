package com.jsp.basic;

public class Binary_To_Decimal {
	public static void main(String[] args) {
		int n = 101111;
		int dec = 0;
		int i = 1;
		while(n!=0)
		{
			int rem=n%10;
			dec+=(rem*i);
			i*=2;
			n/=10;
		}
		System.out.println(dec);
	}
}
