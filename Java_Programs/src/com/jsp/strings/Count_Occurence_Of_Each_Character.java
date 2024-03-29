package com.jsp.strings;

public class Count_Occurence_Of_Each_Character {
	public static void main(String[] args) {
		String s1="ARPANPANIGRAHI";
		String s2="";
		while(s1.length()>0)
		{
			char ch = s1.charAt(0);
			s2 = s1.replace(ch + "", "");
			int count = s1.length()-s2.length();
			System.out.println(ch + "- count is : " +count);
			s1=s2;
		}
	}

}
