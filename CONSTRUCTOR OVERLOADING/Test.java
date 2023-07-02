class AC
{
	int temp;
	
	public AC()
	{
		temp = 21;
	}
	
	public void setTemp(int temp)
	{
		this.temp = temp;
	}
	
	public void displayTemp()
	{
		System.out.println("Temperature="+temp);
	}
}
	
class Test
{
	public static void main(String[] args)
	{
		AC ac1 = new AC();
		AC ac2 = new AC();
		AC ac3 = new AC();
			
		ac1.displayTemp();
		ac1.setTemp(19);
		ac2.setTemp(21);
		ac2.displayTemp();
		ac3.setTemp(18);
		ac3.displayTemp();
	}
}
			