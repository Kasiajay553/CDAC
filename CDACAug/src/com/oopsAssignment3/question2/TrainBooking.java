package com.oopsAssignment3.question2;

public class TrainBooking extends TravelBooking {
	String coachType;
	static int trainNumber=30291;
	TrainBooking(String passengerName,String source, String destination,int distance,String coachType){
		super(passengerName,source,destination,distance);
		
		this.coachType=coachType;
	}
	
	@Override
	double calculateFare() {
		System.out.println("the Train Number: "+trainNumber);
		System.out.println("the Coach type : "+coachType);
		if(coachType.equalsIgnoreCase("ac")) {
			return (distance*15.3);
			
		}
		else  {
			return (distance*8.53);
		}
	}
}
