package com.jsp.stringscodes;

public class SubString_Palindrome 
{
	public static void main(String[] args) 
	{
//		Using split() method
//		String s2 = "madam sir madam madam";
//		String[] arr = s2.split(" ");
//		int count = 0;
//		for(int i = 0; i < arr.length; i++)
//		{
//			String s = arr[i];
//			if(isPalindrome(s))
//				count++;
//		}
//		System.out.println("Number of SubString Palindrome is :" +count);
		
		String s = "MalayalaM";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+2;j<s.length();j++)
			{
				String s1 = s.substring(i,j);
				if(isPalindrome(s1))
					System.out.println(s1);
			}
		}
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
