package com.jsp.stringscodes;

public class Combine_Two_String {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "bcdef";
		String result = "";
		String sub = "";
		int c = 0;
		
		if(s1.length()<s2.length())
		{
			c=s1.length();
			sub=s2.substring(c);
		}
		else
		{
			c=s2.length();
			sub=s1.substring(c);
		}
		for(int i=0;i<c;i++)
		{
			char c1=s1.charAt(i);
			char c2=s2.charAt(i);
			result+=c1;
			result+=c2;
		}
		System.out.println(result+sub);
	}
}
