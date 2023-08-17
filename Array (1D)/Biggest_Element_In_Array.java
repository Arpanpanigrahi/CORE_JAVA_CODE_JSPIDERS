package com.jsp.arrayscode;

public class Biggest_Element_In_Array {
	public static void main(String[] args) {
		int a[] = {9,3,4,1,0,8,7,9};
		int max = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
	}
}
