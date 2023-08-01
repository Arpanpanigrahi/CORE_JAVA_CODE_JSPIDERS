package com.jsp.stringscodes;

public class OccurenceOfChar {
	public static void main(String[] args) {
		String s = "arpanpanigrahi";
		char ch = 'a';
		int count = 0;
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(ch==c)
				count++;
		}
		System.out.println(count);
	}

}
