package com.jsp.strings;

public class Reverse_String {
	public static void main(String[] args) {
		String s = "Arpan";
		char ch[] = s.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
	}
}
