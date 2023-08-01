package com.jsp.stringscodes;

public class Biggest_Substring_Palindrome
{
	public static void main(String[] args) {
		String s = "MalayalaM";
		String bigPalindrome = "";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+2;j<s.length();j++)
			{
				String s1 = s.substring(i,j);
				if(isPalindrome(s1))
				{
					if(bigPalindrome.length() < s1.length())
					{
						bigPalindrome = s1;
					}
				}
			}
		}
		System.out.println(bigPalindrome);
	}
	
	public static boolean isPalindrome(String s1)
	{
		int i = 0;
		int j = s1.length()-1;
		while(i<=j)
		{
			if(s1.charAt(i)!=s1.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}





//{
//	public static boolean isPalindrome(String s1)
//	{
//		int i = 0;
//		int j = s1.length()-1;
//		while(i<=j)
//		{
//			if(s1.charAt(i)!=s1.charAt(j))
//				return false;
//			i++;
//			j--;
//		}
//		return true;
//	}
//	
//	public static void main(String[] args) 
//	{
//		String s1 = "iodadio";
//		int count = 0;
//		String bigString = "";
//		String s2 = "";
//		
//		for(int i=0; i<s1.length();i++)
//		{
//			for(int j=i+2;j<=s1.length();j++)
//			{
//				s2 = s1.substring(i,j);
//				if(isPalindrome(s2))
//				{
//					if(s2.length()>bigString.length())
//					{
//						bigString = s2;
//					}
//				}
//			}
//		}
//		
//	}
//	
//	
//	
//}
