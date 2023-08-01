package com.jsp.stringscodes;

public class String_InitCap {
	public static void main(String[] args) {
		String s = "prabhakarana sripalawardhana atapattu jayasuriya laxmansriramkrishna shivavenkata rajasekara srinieasana trichipalli yekya parampeel parambatur chinnaswami muthuswami venugopal iyer ";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(i == 0|| ch[i]!= ' ' && ch[i-1] ==' ')
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i] = (char) (ch[i]-32); 
				}	
			}
		}
		s = new String(ch);
		System.out.println(s);	
	}
}
