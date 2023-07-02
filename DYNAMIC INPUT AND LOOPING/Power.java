import java.util.*;
public class Power
{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the X value: ");
		int x=sc.nextInt();
		
		System.out.println("Enter the Y value: ");
		int y=sc.nextInt();
		int power=1;
		int base=x;
		
		for(int i=1;i<=y;i++)
		{
			power=power*base;
		}
		System.out.println("Power of a number is :"+power);
	 }
}