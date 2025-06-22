package com.adapter;

public class PaytmAdapter implements PaymentProcessor{
	private PaytmGateway paytm;
	public PaytmAdapter(PaytmGateway paytm) {
		this.paytm=paytm;
	}
	
	@Override
	public void paymentProcess(double amt) {
		paytm.createPayment(amt);
		
	}
	
	
}
