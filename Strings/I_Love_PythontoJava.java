package com.jsp.stringscodes;

public class I_Love_PythontoJava 
{
	public static void main(String[] args) 
	{
		String s1 = "I Love Python";
		String s2 = "Java";
		String target = "Python";
		String s3 = "";
		int i = 0;
		int j = i + 1;
		while(i < s1.length())
		{
			while(j<s1.length() && s1.charAt(j)!=' ')
				j++;
			String temp = "";
			int k = i;
			while(k<j)
			{
				temp += s1.charAt(k);
				k++;
			}
			
			if(temp.equalsIgnoreCase(target))
			{
				temp = s2;
			}
			
			s3 += temp + " ";
			j++;
			i = j;
		}
		System.out.println(s3);
	}
}
