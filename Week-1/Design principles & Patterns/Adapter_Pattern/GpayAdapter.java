package com.adapter;

public class GpayAdapter implements PaymentProcessor {
	private GpayGateway gpay;
	public GpayAdapter(GpayGateway gpay) {
		this.gpay=gpay;
	}
	@Override
	public void paymentProcess(double amt) {
		gpay.sendPayment(amt);
		
	}
}
