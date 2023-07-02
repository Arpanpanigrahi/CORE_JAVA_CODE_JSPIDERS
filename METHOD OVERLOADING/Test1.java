class A 
{
	public static void m1(int i)
	//public void m1(int i)
	{
		System.out.println("I am m1() one arg");
	}
	
	public static void m1(int i, int j)
	//public void m2(int i, int j)
	{
		System.out.println("I am m1() two arg");
	}
	
	public static void m1(int i, int j, int k)
	//public void m3(int i, int j, int k)
	{
		System.out.println("I am m1() one arg");
	}
}

class Test1
{
	public static void main(String[] args)
	{
		A.m1(10);
		A.m1(10,20);
		A.m1(10,20,30);
		
		//A a1 = new A();
		//a1.m1(10);
		//a1.m2(10, 20);
		//a1.m3(10, 20, 30);
	}
}