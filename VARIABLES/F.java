class F
{
	static int a;  //0
	public static void main(String args[])
	{
		System.out.println(a);
		a=10;
		int a;
		a=20;
		System.out.println(a);  //20
		System.out.println(F.a); //10
	}
}