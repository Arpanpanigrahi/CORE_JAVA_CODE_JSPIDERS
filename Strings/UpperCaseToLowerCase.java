package com.jsp.stringscodes;

public class UpperCaseToLowerCase 
{
	public static void main(String[] args) {
		String s = "aBcDe";
		String temp = "";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
				temp+=(char)(ch+32);
			
			else if(ch>='a' && ch<='z')
				temp+=(char)(ch-32);
			
			else
				temp+=ch;
		}
		System.out.println(temp);
	}
}
