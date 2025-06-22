package com.data;

public class NotifierDecorator implements Notifier{
	protected Notifier wrappedNotifier;
	public NotifierDecorator (Notifier note) {
		this.wrappedNotifier=note;
	}
	
	@Override
	public void send(String msg) {
		wrappedNotifier.send(msg);
	}
	
}
