package com.jsp.stringscodes;

public class Substring_Without_Using_SubstringMethod {
	public static void main(String[] args) {
		String s1="abcd";
		char[] ch = s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			String temp="";
			for(int j=i;j<s1.length();j++)
			{
				temp+=ch[j];
				if(temp.length()>=2)
				{
					System.out.println(temp);
				}
			}
		}
	}
}
