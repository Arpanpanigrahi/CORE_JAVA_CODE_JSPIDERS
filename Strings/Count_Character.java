package com.jsp.stringscodes;

public class Count_Character {
	public static void main(String[] args) {
		String s = "arpanpanigrahi";
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			int count = 1;
			for(int j=i+1; j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=' ';
					count++;
				}
			}
			if (ch[i] != ' ')
				System.out.println(ch[i]+" "+count);
		}
	}
}

