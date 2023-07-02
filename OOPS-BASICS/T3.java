class C
{
	public void m1()
	{
		System.out.println("Java is Easy");
	}
	public void m2()
	{
		m1();	//this.m1() /implicit call
		System.out.println("Java is Life");
	}
}
class T3
{
	public static void main(String[] args)
	{
		C c1 = new C();
		c1.m2();
	}
}
	