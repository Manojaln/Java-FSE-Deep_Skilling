package com.data;

public class NotificationTest {
	public static void main(String[] args) {
		// Base Notifier - Email only
        Notifier notifier = new EmailNotifier();
        // Add SMS functionality
        notifier = new SMSNotifierDecorator(notifier);
        // Add Slack functionality on top
        notifier = new SlackNotifierDecorator(notifier);
        // Send notification through all channels
        notifier.send("Server Down Alert!");
	}
}
