package com.jsp.stringscodes;

public class Non_Repeated_Character_Or_Remove_Duplicates {
	public static void main(String[] args) {
		String s = "Ramana";
		String s2 = "";
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			boolean flag = true;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j] = ' ';
					flag = false;
				}
			}
			if(!flag)
				ch[i]=' ';
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
				s2 += ch[i];
		}
		System.out.println(s2);
	}
}
