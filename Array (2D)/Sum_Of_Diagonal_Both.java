package com.jsp.arrayprgs;

public class Sum_Of_Diagonal_Both {
	public static void main(String[] args) {
		int a[][] = {  {1,2,3},
					   {4,5,6},
					   {7,8,9}
					};
		int len = a.length;
		int sum = 0;
		for(int i=0; i<len;i++)
		{
			sum += a[i][i];
			
			if(i==len/2)
				continue;
			
			sum+=a[i][len-1-i];
		}
		System.out.println(sum);
	}
}
