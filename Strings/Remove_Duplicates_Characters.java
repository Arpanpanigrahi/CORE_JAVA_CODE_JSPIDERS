package com.jsp.stringscodes;

public class Remove_Duplicates_Characters {
	public static void main(String[] args) {
		String s = "arpanpanigrahi";
		String temp = "";
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(temp.indexOf(ch)==-1)
			{
				temp += ch;
			}
		}
		System.out.println(temp);
	}
}
