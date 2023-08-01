package com.jsp.stringscodes;

public class Alpha_Num_Char {
	public static void main(String[] args) {
		String s = "1ab2c#@";
		String sl = "";
		String sn = "";
		String sp = "";
		String temp = "";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
				sl+=ch;
			else if(ch>='0'&&ch<='9')
				sn+=ch;
			else
				sp+=ch;
		}
		temp = sl+sn+sp;
		System.out.println(temp);  //abc12#@
	}

}
