package com.jsp.arrayscode;

public class Sum_Of_Odd_Elements {
	public static void main(String[] args) {
		int a[] = {3,4,57,89,66,51};
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
				sum += a[i];
		}
		System.out.println(sum);
	}
}
