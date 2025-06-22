package com.data;

public class SlackNotifierDecorator extends NotifierDecorator {

	public SlackNotifierDecorator(Notifier note) {
		super(note);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void send(String msg) {
		super.send(msg);
		System.out.println("Sending Slack Message: "+ msg);
	}
}
