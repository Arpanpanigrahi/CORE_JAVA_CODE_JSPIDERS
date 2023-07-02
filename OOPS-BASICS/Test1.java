class A
{
	int i = 45;
	public void m1()
	{
		int i = 100;
		System.out.println("i ="+i); //100
		System.out.println("i ="+this.i); //45
	}
}
class Test1
{
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.m1();
	}
}