package com.jsp.searching;

public class Linear_Search 
{
	public static void main(String[] args) {
		int a[] = {9,6,5,4,3,2,1,0};
		System.out.println(search(5,a));
	}
	
	public static int search(int e, int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==e)
				return i;
		}
		return -1;
	}
}