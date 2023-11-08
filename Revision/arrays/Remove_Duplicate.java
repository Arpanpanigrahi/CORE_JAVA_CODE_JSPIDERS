package com.jsp.arrays;

public class Remove_Duplicate {
	public static void main(String[] args) {
		int a[] = {9,4,5,2,6,9,5,6,4};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
				System.out.println(a[i]+ " ");
		}
	}
}
