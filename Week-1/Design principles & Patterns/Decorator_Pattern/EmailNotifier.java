package com.data;

public class EmailNotifier implements Notifier {

	@Override
	public void send(String msg) {
		System.out.println("Sending Email: "+msg);
	}
	
}
