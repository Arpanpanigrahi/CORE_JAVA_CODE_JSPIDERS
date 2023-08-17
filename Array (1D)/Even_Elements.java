package com.jsp.arrayscode;

public class Even_Elements {
	public static void main(String[] args) {
		int a[] = {3,4,57,86,66};
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
	}
}
