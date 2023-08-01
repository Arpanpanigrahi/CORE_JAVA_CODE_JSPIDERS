package com.jsp.stringscodes;

public class KnowledgeToledgeKnow 
{
	public static void main(String[] args) 
	{
		String s1="knowledge";
		char[]word=s1.toCharArray();
		String s2="";
		
		for(int i=4; i<s1.length(); i++)
		{
			s2+=word[i];
		}
		for(int j=0; j<4; j++)
		{
			s2+=word[j];
		}
		System.out.println(s2);	
	}
}
