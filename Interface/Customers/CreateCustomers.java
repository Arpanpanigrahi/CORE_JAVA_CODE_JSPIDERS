package com.jsp.Customers;

public class CreateCustomers
{
	public static void main(String[] args) 
	{
		Flipkart cust1 = new Flipkart("Arpan","Male");
		System.out.println(cust1);
		cust1.purchase();
		cust1.continueForPayment();
	}
}
