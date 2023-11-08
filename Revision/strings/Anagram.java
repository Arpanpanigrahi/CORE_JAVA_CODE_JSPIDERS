package com.jsp.strings;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String s1 = "keep";
		String s2 = "peek";
		
		if(isAnagram(s1,s2))
			System.out.println(s1 + " Anagram to " +s2);
		else
			System.out.println("Not an Anagram Strings");
	}
	
	public static boolean isAnagram(String s1, String s2)
	{
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		while(true)
		{
			if(s1.length() != s2.length())
				return false;
			if(s1.length()==0 && s2.length()==0)
				return true;
			
			char ch = s1.charAt(0);
			s1 = s1.replace(ch + "","");
			s2 = s2.replace(ch + "","");	
		}
	}
}

