package com.jsp.arrayprgs;

public class Sum_Of_Diagonal_In_Matrix {
	public static void main(String[] args) {
		int a[][] = {  {1,2,3},
					   {4,5,6},
					   {7,8,9}
					};
		//int len = a.length;
		int sum = 0;
		for(int i=0; i<a.length;i++)
		{
			sum += a[i][i];
		}
		System.out.println(sum);
	}
}
