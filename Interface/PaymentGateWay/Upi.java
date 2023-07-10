package com.jsp.PaymentGateWay;

public class Upi implements Payable
{
	@Override
	public void pay()
	{
		System.out.println("Payment Done through Upi Successfully");
	}
}
