package com.jsp.PaymentGateWay;

import java.util.Scanner;

public class Mobikwik 
{
	public static Payable getPaymentObject()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Select Payment Mode : ");
		System.out.println("1. UPI \n" + "2. CREDIT CARD \n" + "3. NET BANKING");
		
		int select_payment = scan.nextInt();
		if(select_payment==1) return new Upi();
		if(select_payment==2) return new CreditCard();
		if(select_payment==3) return new Netbanking();
		
		System.out.println("Payment Not Selected / or Invalid");
		return null;	
	}
}
