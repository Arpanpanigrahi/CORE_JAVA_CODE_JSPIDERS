package com.jsp.stringscodes;

public class Happy_Count_In_String {
	public static void main(String[] args) {
		String s1="Happy Happy Birthday";
		char[] word=s1.toCharArray();
		String[] ch=new String[10];
		int x=0;
		int i=0;
		int j=i+1;
		int small=0;
		String big1 = "";
		
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
			ch[x++]=temp;
			j++;
			i=j;
		}
		int count=0;
		for(int l1=0;l1<x;l1++)
		{
			for(int l2=0;l2<x;l2++)
			{
				if(ch[l1].equals(ch[l2]))
				{
					count++;
				}
			}
			if(count > small)
			{
				small = count;
				big1 = ch[l1];
			}
			count=0;
		}
		System.out.println(big1+" count is "+small);
	}
}
