package com.jsp.stringscodes;

public class Vowel_ConsonantCount {
	public static void main(String[] args) {
		String s = "arpanpanigrahi";
		int vcount=0;
		int ccount=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vcount++;
				else
					ccount++;
			}
		}
		System.out.println("Vowel Count :" +vcount);
		System.out.println("Consonant Count :" +ccount);
	}

}
