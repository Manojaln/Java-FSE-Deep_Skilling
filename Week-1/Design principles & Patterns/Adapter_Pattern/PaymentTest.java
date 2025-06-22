package com.adapter;

public class PaymentTest {
	public static void main(String[] args) {
		 // Using Gpay adapter
        GpayGateway gpay = new GpayGateway();
        PaymentProcessor gpayAdpt = new GpayAdapter(gpay);
        gpayAdpt.paymentProcess(1500.50);

        // Using Paytm adapter
        PaytmGateway paytm = new PaytmGateway();
        PaymentProcessor paytmAdpt= new PaytmAdapter(paytm);
        paytmAdpt.paymentProcess(2500.00);
	}
}
