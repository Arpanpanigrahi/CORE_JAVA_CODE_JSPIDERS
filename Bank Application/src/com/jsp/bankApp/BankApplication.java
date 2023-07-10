package com.jsp.bankApp;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount :");
		double amount = new Scanner(System.in).nextDouble();
		
		Salesman salesman = new Salesman();
		salesman.provideLoanInfo(new ICICI(), amount);
	}
}