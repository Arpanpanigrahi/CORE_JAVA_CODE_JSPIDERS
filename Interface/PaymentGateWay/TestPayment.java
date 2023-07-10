package com.jsp.PaymentGateWay;

public class TestPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payable paymentObject = Mobikwik.getPaymentObject();
		paymentObject.pay();
	}
}
