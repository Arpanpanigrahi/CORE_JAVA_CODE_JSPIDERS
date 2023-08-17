package com.jsp.arrayscode;

public class Print_Prime_Element 
{
	public static void main(String[] args) 
	{
		int a[] = {1,3,4,7,11};
		
		for(int i=0;i<a.length;i++)
		{
			if(isPrime(a[i]))
				System.out.println(a[i] + " ");
		}
	}
	
	public static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		boolean flag = true;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			return true;
		else
			return false;
	}
}
