class H
{
	int a;
	static int b;
	public static void main(String[] args)
	{
		H h1=new H();
		System.out.println(h1.a);
		System.out.println(H.b);
		System.out.println(h1.b);
	}
}
