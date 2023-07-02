import java.util.Scanner;
class BillGenerator

{
	public static void main(String[] args) 
	{
		Scanner os=new Scanner(System.in);
		System.out.println("Enter no.of units");
		int u = os.nextInt();
		System.out.println("Enter Due amount:");
		double due =os.nextDouble();
		double amt=0;

	if(u<50)
		System.out.println("50 X Rs.0=Rs.0");
	else if(u<=100)
		{
		amt=(50*0) + (u-50)*3;
		System.out.println("50 X Rs.0 = Rs.0");
		System.out.println(u - 50 +"X Rs.3 =Rs." +amt);
		}
		else if(u<150)
		{
			amt=(50 * 0)+(50 * 3)+(u - 100)*6;
			System.out.println("50 X Rs.0 = Rs.0");
			System.out.println("50 X Rs.3 = Rs.150");
			System.out.println((u - 150)+"X Rs.6="+((u - 100)*6));
		}
		else if (u <=200)
	
		{
			amt = (50*0)+(50*3)+(50*6)+(50*8)+(u - 150)*8;
			System.out.println("50 X Rs.0 = Rs.0");
			System.out.println("50 X Rs.3 = Rs.150");
			System.out.println("50 X Rs.6 = Rs.300");
			System.out.println((u - 150)+" X Rs.8 = Rs."+((u-150)*8));
		}
		else
			amt=(50*0)+(50*3)+(50*6)+(50*8)+(u-200)*10;
            System.out.println("50 X Rs.0 = Rs.0");
            System.out.println("50 X Rs.3 = Rs.150");
            System.out.println("50 X Rs.6 = Rs.300");
            System.out.println("50 X Rs.8 = RS.400");
            System.out.println((u-200)+"X Rs.10 = Rs."+((u - 200)*10));
	
	if(due == 0.0)
	{
		double discount = amt* 0.05;
		System.out.println("Discount = Rs."+discount);
		amt -= discount;
	}
	else
	{
		double interest = due *0.1;
		System.out.println("interest = Rs."+interest);
		System.out.println("Due amt = Rs. "+due);
		amt += interest+due;
	}
	System.out.println("net Amount:Rs. "+amt);
	}
}
