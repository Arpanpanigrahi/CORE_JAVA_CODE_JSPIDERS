class StrongNumber
{
	public static void main(String[] args)
	{
		int num=145;
		int copy=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
				sum+=fact;
				num/=10;
			}
			if(sum==copy)
				System.out.println("Strong Number");
			else
				System.out.println("Not a Strong Number");
		}
	}
}