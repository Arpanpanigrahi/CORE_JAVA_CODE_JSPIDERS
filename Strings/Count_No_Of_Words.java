package com.jsp.stringscodes;

public class Count_No_Of_Words {
	public static void main(String[] args) {
		String s1 = "I Love Java";
		String s2 = "";
		char[] word=s1.toCharArray();
		int i=0;
		int j=0;
		int count=0;
		while(i<word.length)
		{
			while(j<word.length && word[j]!=' ')
				j++;
			String temp="";
			int k=i;
			
			while(k<j)
			{
				temp+=word[k];
				k++;
			}
			count++;
			s2+=temp;
			if(j<word.length)
				s2+=" ";
			j++;
			i=j;
		}
		System.out.println("Number of words count in I Love Java (s2) is :" +count);
	}
}
