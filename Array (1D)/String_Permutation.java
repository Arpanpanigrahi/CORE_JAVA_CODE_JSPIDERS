package com.jsp.arrayscode;

public class String_Permutation {
	public static void main(String[] args) {
		String s = "abc";
		int start = 0;
		int end = s.length();
		isPermutation(s,start,end);
	}
	
	public static void isPermutation(String s, int start, int end)
	{
		if(start==end) {
			System.out.println(s);
			return;
		}
		for(int i=start; i<end; i++)
		{
			String s1 = swap(s,start,i);
			isPermutation(s1,start+1,end);
		}
	}
	
	public static String swap(String s, int i, int j)
	{
		char ch[] = s.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return new String(ch);		
	}
}
