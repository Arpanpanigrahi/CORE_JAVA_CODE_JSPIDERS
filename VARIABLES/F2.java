class F2
{
	int a=10; //non-static var.
	public static void main(String args[])
	{
		F2 f1 = new F2();
		System.out.println(f1.a);
		F2 f2 = new F2();
		System.out.println(f2.a);
		F2 f3 = new F2();
		System.out.println(f3.a);
	}
}
		
		