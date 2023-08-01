package com.jsp.stringscodes;

public class Alphanumeric_String {
	public static void main(String[] args) {
		String s = "A@123";
		int sum = 0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				sum = sum + (s.charAt(i) - '0');
			}
		}
		System.out.println("Sum of numbers in Alphanumeric String :" +sum);
	}
}
