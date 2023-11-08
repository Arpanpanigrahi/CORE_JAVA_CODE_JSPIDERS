package com.jsp.arrays;

public class Add_Sum_Of_Even_And_Odd_Numbers {
	public static void main(String[] args) {
		int sumEven=0, sumOdd=0;
		int a[] = {11,22,33,44,55};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sumEven = sumEven + a[i];
			}
			else
			{
				sumOdd = sumOdd + a[i];
			}
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}
}
