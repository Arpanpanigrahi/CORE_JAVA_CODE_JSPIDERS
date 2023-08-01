package com.jsp.stringscodes;

public class CaseCount 
{
	public static void main(String[] args) {
		String s1 = "ArpaN@1234";
		int uc=0, lc=0, nc=0, sp=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A'&& s1.charAt(i)<='Z')
				uc++;
			else if(s1.charAt(i)>='a'&& s1.charAt(i)<='z')
				lc++;
			else if(s1.charAt(i)>='0'&& s1.charAt(i)<='9')
				nc++;
			else
				sp++;
		}
		System.out.println("UpperCase :" +uc);
		System.out.println("LowerCase :" +lc);
		System.out.println("NumCase :" +nc);
		System.out.println("SpCase :" +sp);
	}

}
