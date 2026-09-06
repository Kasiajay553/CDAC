package com.oopsAssignment3.question5;

public class PushNotification implements Notification{
	String deviceId;
	static String appName="MyShoppingApp";
	PushNotification(String deviceId){
		this.deviceId=deviceId;
	}
	
	@Override
	public void sendNotification(String message) {
		System.out.println("-----------Push Notification-----------");
		System.out.println("App : "+deviceId);
		System.out.println("Subject : "+appName);
		System.out.println("message sent through "+message);
		
	}
	@Override
	public void showstatus() {
		System.out.println("Status : Notification Delivered");
		
	}

}
