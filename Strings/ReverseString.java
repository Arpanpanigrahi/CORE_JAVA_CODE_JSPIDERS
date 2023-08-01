package com.jsp.stringscodes;

public class ReverseString 
{
	public static void main(String[] args) {
		String s = "ArpanPanigrahi";
		char[] ch = s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
