package com.oopsAssignment3.question3;

public class Vehicle {

	String vehicleNumber;
	String brand;
	int rentPerDay;
	 Vehicle(String vehicleNumber,String brand,int rentPerDay){
		 this.vehicleNumber=vehicleNumber;
		 this.brand=brand;
		 this.rentPerDay=rentPerDay;
	 }
	 void vehicleDetails(){
		 System.out.println("the vehicle Number : "+vehicleNumber);
		 System.out.println("the brand of the Vehicle : "+brand);
		 System.out.println("the rent per day : "+rentPerDay);
		 
	 }
	 int calculateRent() {
		 return rentPerDay*200;
	 }
}
