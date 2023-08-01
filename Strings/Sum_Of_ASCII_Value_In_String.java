package com.jsp.stringscodes;

public class Sum_Of_ASCII_Value_In_String {
	public static void main(String[] args) {
		String s1 = "No";
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			sum+=c;
		}
		System.out.println(sum);
	}
}
