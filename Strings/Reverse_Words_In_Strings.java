package com.jsp.stringscodes;

public class Reverse_Words_In_Strings 
{
	public static void main(String[] args) 
	{
		String s = "java is easy";
		String s2 = " ";
		char[] ch = s.toCharArray();
		
		int i = ch.length-1;
		int j = ch.length-1;
		while(j>-1)
		{
			while(j>-1 && ch[j]!=' ')
				j--;
			int k = j + 1;
			String temp = " ";
			while(k<=i)
			{
				temp += ch[k];
				k++;
			}
			s2 +=temp;
			if(j>-1) //to remove last space
				s2+=" ";
			j--;
			i=j;
		}
		System.out.println(s2);
	}
}