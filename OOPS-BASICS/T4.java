class D
{
	int j;
	public void changeValue(int j)
	{
		this.j = j;
	}
	public void displayValue()
	{
		System.out.println(j);
	}
}
class T4
{
	public static void main(String[] args)
	{
		D d1 = new D();
		d1.displayValue(); //10
		d1.changeValue(18);
		d1.displayValue(); //18
	}
}