package com.oopsAssignment3.question3;

public class Car extends Vehicle {
	int numberOfSeats;
	int numberOfDays;
	Car(String vehicleNumber,String brand,int rentPerDay,int numberOfSeats,int numberOfDays){
		super(vehicleNumber,brand,rentPerDay);
		this.numberOfDays=numberOfDays;
		this.numberOfSeats=numberOfSeats;
	}
	
	@Override
	 
	int calculateRent() {
		System.out.println("the of days is : "+numberOfDays);
		if(numberOfSeats>=7) {
			return (rentPerDay*numberOfDays)+1200;
		}
		else
			return (rentPerDay*numberOfDays)+1000;
	}

}
