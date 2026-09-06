package com.oopsAssignment3.question2;

public class TravelBooking {
	static int bookingId=13245674;
	String passengerName;
	String source;
	String destination;
	int distance;
	TravelBooking(String passengerName,String source, String destination,int distance){
		//this.bookingId=bookingId;
		this.passengerName=passengerName;
		this.source=source;
		this.destination=destination;
		this.distance=distance;
	}
	public void travelingdetails() {
		System.out.println("The booking  Id is : "+bookingId);
		System.out.println("The passenger name is : "+passengerName);
		System.out.println("The starting/source is : "+source);
		System.out.println("The destination is : "+destination);
		System.out.println("The distance is : "+distance);
	}
	double  calculateFare() {
		return 0;
	}

}
