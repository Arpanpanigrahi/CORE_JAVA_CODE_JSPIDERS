package com.jsp.stringscodes;

public class Change_Repeated_Character_To_Numbers {
	public static void main(String[] args) {
		String s = "HelloWorld";
		System.out.println(count(s));
	}
	
	public static String count(String s)
	{
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count = 49;
			boolean flag = true;
			for(int j = i+1; j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=(char)count;
					flag=false;
				}
			}
			if(!flag)
				ch[i]=49;
		}
		return new String(ch);
	}
}
