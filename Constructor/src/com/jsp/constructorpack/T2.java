package com.jsp.constructorpack;

class AC
{
	int temp;
	AC()
	{
		temp = 20;
	}
	
	AC(int temp)
	{
		this.temp = temp; //this keyword will execute for non static variables
	}
}

public class T2
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AC ac1 = new AC();
		System.out.println(ac1.temp);
		
		AC ac2 = new AC(18);
		System.out.println(ac2.temp);
	
	}

}

