package com.oopsAssignment3.question5;

public class EmailNotification implements Notification {
	
	String emailId;
	static String subject="Account update";
	EmailNotification(String emailId){
		this.emailId=emailId;
		
	}
	
	@Override

	public void sendNotification(String message) {
		System.out.println("-----------Email Notification-----------");
		System.out.println("Email : "+emailId);
		System.out.println("Subject : "+subject);
		System.out.println("message sent through "+message);
	}
	public void showstatus() {
		System.out.println("Status :Email Delivered");
	}

}
