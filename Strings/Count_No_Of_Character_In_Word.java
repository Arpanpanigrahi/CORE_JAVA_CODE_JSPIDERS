package com.jsp.stringscodes;

public class Count_No_Of_Character_In_Word 
{
	public static void main(String[] args) {
		String s = "java is easy";
		String s2 = " ";
		char[] ch = s.toCharArray();
		int i=0;
		int j=0;
		
		while(j<s.length())
		{
			while(j<s.length()&&ch[j]!=' ')
				j++;
			int k = j-1;
			String temp=" ";
			while(k>=i)
			{
				temp += ch[k];
				k--;
			}
			s2 += temp;
			if(j<s.length())
				s2+=temp;
			if(j<s.length()) // to remove last extra space
				s2+=" ";
			j++;
			i=j;
		}
		System.out.println(s2);
	}
}