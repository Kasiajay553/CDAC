package com.oopsAssignment3.question5;

public class SMSNotification implements Notification {
	long mobileNumber;
	static String provider="Airtel";
	SMSNotification(long mobileNumber){
		this.mobileNumber=mobileNumber;
	}
	@Override
	public void sendNotification(String message) {
		System.out.println("-----------SMS Notification-----------");
		System.out.println("Moblie : "+mobileNumber);
		System.out.println("Subject : "+provider);
		System.out.println("message sent through "+message);
		
	}
	@Override
	public void showstatus() {
		System.out.println("Status : SMS Delivered");
		
	}
	

}
