package com.jsp.stringscodes;

public class CharInAscendingOrder {
	public static void main(String[] args) {
		String s = "bcaedtcu";

		char[] ch = s.toCharArray();
		for(int i=0; i<=ch.length;i++)
		{
			for(int j=i+1;j<=ch.length-1;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		for(char n:ch)
		{
			System.out.print(n+" ");
		}
		
//		Arrays.sort(ch);
//		System.out.println(Arrays.toString(ch));
	}

}
