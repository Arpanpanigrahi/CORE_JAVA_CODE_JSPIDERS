package com.jsp.arrayscode;

public class Second_Highest_Number_In_Array {
	public static void main(String[] args) {
		int a[] = {10,4,6,3,9,7,0,8,10};
		int max1 = 0;
		int max2 = 0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2 = max1;
				//max1 = max1;
				max1 = a[i];
			}
			else if(a[i]>max2 && a[i]!=max1)
				max2 = a[i];
		}
		System.out.println(max2);
	}

}
