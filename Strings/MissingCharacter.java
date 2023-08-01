package com.jsp.stringscodes;

public class MissingCharacter {
	public static void main(String[] args) {
		String s = "AIRTEL";
		
		for(char ch='A'; ch<='Z'; ch++)
		{
			if(s.indexOf(ch)==-1)
			{
				System.out.println(ch);
			}
		}
	}
}
