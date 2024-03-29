package com.jsp.strings;
/*
 * Remove duplicate words in a string
 */
public class Remove_Duplicate_Elements {
	public static void main(String[] args) {
		String s = "aabbccdd";
		String temp = " ";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(temp.indexOf(ch)==-1)
			{
				temp+=ch;
			}
		}
		System.out.println(temp);
	}
}
