package com.jsp.strings;

public class Panagram {
	public static void main(String[] args) {
		String s = "a quick brown fox jumps over the lazy dog";
		if(isPanagram(s))
			System.out.println("The given string is Panagram");
		else
			System.out.println("Not a Panagram");
	}

	public static boolean isPanagram(String s) {
		// TODO Auto-generated method stub
		s=s.toLowerCase();
		if(s.length()<26)
			return false;
		
		for(char ch='a';ch<='z';ch++)
		{
			if(s.indexOf(ch)==-1)
				return false;
		}
		return true;
	}
}

