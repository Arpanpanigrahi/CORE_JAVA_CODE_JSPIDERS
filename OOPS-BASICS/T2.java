class B
{
	int i = 12;
	public void m2()
	{
		System.out.println("i= "+i); //this.i
	}
}
class T2
{
	public static void main(String[] args)
	{
		B b1 = new B();
		b1.m2();
	}
}
		

