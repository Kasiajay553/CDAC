package com.oopsAssignment3.question3;

public class Bike extends Vehicle{
	int numberOfhelmet;
	int numberOfDays;
	Bike(String vehicleNumber,String brand,int rentPerDay,int numberOfhelmet,int numberOfDays){
		super(vehicleNumber,brand,rentPerDay);
		this.numberOfDays=numberOfDays;
		this.numberOfhelmet=numberOfhelmet;
	}
	
	@Override
	 
	int calculateRent() {
		System.out.println("the of days is : "+numberOfDays);
		if(numberOfhelmet==2) {
			return (rentPerDay*numberOfDays)+200;
		}
		else
			return (rentPerDay*numberOfDays)+100;
	}
}
