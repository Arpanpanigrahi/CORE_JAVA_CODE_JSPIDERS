package com.jsp.stringscodes;

public class Replace_Existing_Character_Within_Strings {
	public static void main(String[] args) {
		String s = "java";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				ch[i]='#';
			}
		}
		System.out.println(new String(ch));
	}
}
