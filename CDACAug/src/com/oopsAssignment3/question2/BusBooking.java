package com.oopsAssignment3.question2;

public class BusBooking extends TravelBooking {
	String busType;
	static int seatNumber=33;
	BusBooking(String passengerName,String source, String destination,int distance,String busType){
		super(passengerName,source,destination,distance);
		this.busType=busType;
		
	}
	
	@Override
	double calculateFare() {
		System.out.println("the bus type : "+busType);
		System.out.println("the seat number : "+seatNumber);
		if(busType.equalsIgnoreCase("ac")) {
			return (distance*12.3);
			
		}
		else  {
			return (distance*9.53);
		}
	}
	

}
