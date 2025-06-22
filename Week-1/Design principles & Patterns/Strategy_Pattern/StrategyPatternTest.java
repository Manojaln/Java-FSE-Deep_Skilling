package com.statery;

public class StrategyPatternTest {
	 public static void main(String[] args) {
	        PaymentContext context = new PaymentContext();
	        // Using Credit Card
	        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "Manoj V"));
	        context.makePayment(2000.00);
	        System.out.println();
	        // Using PayPal
	        context.setPaymentStrategy(new PayPalPayment("manoj@example.com"));
	        context.makePayment(3500.50);
	    }
}
