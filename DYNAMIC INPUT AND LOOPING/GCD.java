import java.util.Scanner;
class GCD
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		int gcd=1;
		System.out.println("Enter n1:");
		n1 = sc.nextInt();
		System.out.println("Enter n2:");
		n2 = sc.nextInt();
		
		for (int i = 1; i <= n1 && i <= n2; i++) 
		{

      // check if i perfectly divides both n1 and n2
      if (n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }

    System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
	}
}

































/*
import java.util.Scanner;
class GCD
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,i,gcd=0;
		System.out.println("Enter No:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		for(i=1; i<=n1&&i<=n2;i++)
		{
			if(n1%i==0&&n2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("First Number : "+n1);
		System.out.println("Second Number : "+n2);
		System.out.println("GCD : "+gcd);
	}
}
*/		