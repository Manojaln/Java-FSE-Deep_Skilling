package com.data;

public class SMSNotifierDecorator extends NotifierDecorator {

	public SMSNotifierDecorator(Notifier note) {
		super(note);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void send(String msg) {
		super.send(msg);
		System.out.println("Sending SMS: "+msg);
	}
	
	
}
