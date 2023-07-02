class Test
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		System.out.println(a-- + --a + b--); //9+10+19=38
		System.out.println(--a + b-- + a);
		System.out.println(a);
		System.out.println(b);
	}
}
	