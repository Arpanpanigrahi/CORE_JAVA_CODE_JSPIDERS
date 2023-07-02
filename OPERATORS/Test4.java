class Test4
{
	public static void main(String[] args)
	{
		int i=1;
		int j=2;
		int k=i++ + j--;
		System.out.println(k++ + --k);
		System.out.println(j++ + ++i);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}