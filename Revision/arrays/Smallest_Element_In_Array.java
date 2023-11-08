package com.jsp.arrays;

public class Smallest_Element_In_Array {
	public static void main(String[] args) {
		int a[] = {9, 5, 4, 3, 2, 10, 0};
		int min = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i] < min)
				min = a[i];
		}
		System.out.println(min);
	}
}
