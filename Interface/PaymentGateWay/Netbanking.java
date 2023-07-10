package com.jsp.PaymentGateWay;

public class Netbanking implements Payable
{
	@Override
	public void pay()
	{
		System.out.println("Payment Done through Netbanking Successfully");
	}
}