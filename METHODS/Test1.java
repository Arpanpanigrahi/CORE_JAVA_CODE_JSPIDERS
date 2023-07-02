/*
import java.util.Scanner;
class Test1
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("i=");
		int i = scan.nextInt();
		
		if(i>10)
		{
			m1();
		}
		else
		{
			m2();
		}
		static void m1()
		{
			System.out.println("Good Morning");
		}
		static void m2()
		{
			System.out.println("Java is Life");
		}
	}
}
*/

class Test1
{
	public static void main(String[] args)
	{
		m1(5,10);
		m2("Manu");
	}
	static void m1(int num1,int num2)
	{
		System.out.println(num1+num2);
	}
	static void m2(String name)
	{
		System.out.println("Hello" +name);
	}
}
	