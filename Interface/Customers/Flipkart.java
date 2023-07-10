package com.jsp.Customers;

import com.jsp.PaymentGateWay.Mobikwik;
import com.jsp.PaymentGateWay.Payable;

//import com.jsp.PaymentGateWay.*;

public class Flipkart 
{
	static int count;
	int fid;
	String name;
	String gender;
	
	static
	{
		count = 1000;
	}
	
	{
		count++;
		fid = count;
	}
	
	public Flipkart(String name, String gender)   
	{
		this.name = name;
		this.gender = gender;
	}
	
	public void purchase()
	{
		System.out.println("Purchase Logic");
	}
	
	public void continueForPayment()
	{
		Payable paymentObject = Mobikwik.getPaymentObject();
		paymentObject.pay();
	}
	
	@Override
	public String toString()
	{
		return "CID: " + fid + "Name: " + name + "Gender: " + gender;
	}

}
