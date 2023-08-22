package com.jsp.arrayprgs;

public class Matrix_Multiplication {
	public static void main(String[] args) {
		int a[][] = {   {1,2,3},
				   		{4,5,6},
				   		{7,8,9}
					};
		
		int b[][] = {   {1,2,3},
				   		{4,5,6},
				   		{7,8,9}
					};
		
		int c[][] = multiply(a,b);
		for(int t[]:c)
		{
			for(int n:t)
			{
				System.out.print(n +"\t");
			}
			System.out.println();
		}
	}
	private static int[][] multiply(int a[][], int b[][])
	{
		int len = a.length;
		int [][]c = new int[len][len];
		
		for(int i=0; i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				int sum=0;
				for(int k=0;k<len;k++)
				{
					sum+=a[i][k]*b[k][j];
				}
				c[i][j]=sum;
			}
		}
		return c;
	}
}
			