package com.jsp.stringscodes;

public class Palindrome_String 
{
	public static void main(String[] args) 
	{
//		System.out.println("MadaM");
		String s = "MalayalaM";
		if(isPalindrome(s))
			System.out.println("The given string is Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
	
	public static boolean isPalindrome(String s)
	{
		int i = 0;
		int j = s.length() - 1;
		while(i<=j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
