

import java.util.Scanner;

public class oddeven {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("num");
	int num=scn.nextInt();
	boolean result = oddeven (num);
	if (result == true)
		System.out.println("even");
	else
		System.out.println("odd");
}
	public static boolean oddeven (int num)
	{
		if (num%2==0)
			return true;
		else
			return false;
	}
}