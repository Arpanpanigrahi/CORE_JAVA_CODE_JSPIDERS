package com.jsp.PaymentGateWay;

public class CreditCard implements Payable
{
	@Override
	public void pay()
	{
		System.out.println("Payment Done through Credit Card Successfully");
	}
}