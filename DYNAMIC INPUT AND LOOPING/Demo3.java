class Demo3
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		for(int i=1; i<=5; i++)
		{
			if(i==3)
				//break;
				//continue;
				return;
			System.out.println(i);
		}
		System.out.println("main ends");
	}
}