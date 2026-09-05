package com.oopsAssignment3.question5;

public class NotificationSystemMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notification n;
		n=new EmailNotification("ajay@gmai.ccm");
		n.sendNotification("email");
		n.showstatus();
		
		
		n=new SMSNotification(9876543210L);
		n.sendNotification("SMS");
		n.showstatus();
		
		n=new PushNotification("DEV1023");
		n.sendNotification("Notification");
		n.showstatus();

	}

}
