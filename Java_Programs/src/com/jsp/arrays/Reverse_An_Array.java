package com.jsp.arrays;

import java.util.Arrays;

public class Reverse_An_Array {
	public static void main(String[] args) {
		int a[] = {9,8,7,6,5,4,3,1};
		int b[] = new int[a.length];
		int j = 0;
		
		for(int i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		System.out.println(Arrays.toString(b));
	}
}
