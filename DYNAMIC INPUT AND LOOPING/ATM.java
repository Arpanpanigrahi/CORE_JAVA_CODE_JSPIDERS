import java.util.Scanner;
class ATM 
{
	static int bal = 20000;
	public static void main(String[] args) 
	{
		boolean flag = true;
		Scanner os = new Scanner(System.in);
		do{
		System.out.println("****Home Page****");
		System.out.println("1.deposit\n2.WithDraw\n3.ViewBalance\n4.exit");
		System.out.println("Choose your choice : ");
		
		int choice = os.nextInt();

		switch (choice)
		{
		case 1:
			{
				System.out.println("Enter amount to deposit :");
				int amt = os.nextInt();
				deposit(amt);
			}
			break;
		case 2:
			{
				System.out.println("Enter amount to withdraw :");
				int amt = os.nextInt();
				withdraw(amt);
			}
			break;
			case 3:
			{
				viewBalance();
			}
			break;
			case 4:
			{
				System.out.println("Are you sure ?\n1.exit\nany other num to continue");
				int num = os.nextInt();
				if(num ==1)
				{
					flag = false;
					System.out.println("_________Thank you_________");
				}


			}
				break;
			default:
				System.out.println("invalid");
		
		}	
		}while(flag);

	}
	public static void deposit(int amt){
			if(amt % 100 == 0){
				bal += amt;
				System.out.println("Deposited successfully");
			}
			else
				System.out.println("Enter amount in 100's ");
	}
	public static void withdraw(int amt){
		if(amt % 100 == 0)
		{
			if(amt <= bal)
			{
				bal -= amt;
				System.out.println("Withdrawn successfully");
			}
			else
				System.out.println("insufficient funds");
		}
		else
			System.out.println("Enter amount in 100's ");

	}
	public static void viewBalance()
	{
		System.out.println(bal);
	}
}
