class Test1
{
	public static void main(String[] args)
	{
		int l=3;
		int m=4;
		m=l++ + m--;
		System.out.println(--m + ++m + m--);
		System.out.println(l);
		System.out.println(m);
	}
}