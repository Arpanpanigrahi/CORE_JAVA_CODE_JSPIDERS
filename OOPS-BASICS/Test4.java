class AC
{
	int temp;
	boolean on=false;
	
	void switchOn()
	{
		on=true;
		temp=23;
		System.out.println("ac is on, curr temp=" +temp);
	}
	
	void increaseTemp()
	{
		if(on==false)
		{
			System.out.println("first switch pn the AC");
			return;
		}
		temp++;
		System.out.println("temp increased");
	}
}

class Test4
{
	public static void main(String[] args)
	{
		AC ac1 = new AC();
		ac1.switchOn();
		ac1.increaseTemp();
	}
}