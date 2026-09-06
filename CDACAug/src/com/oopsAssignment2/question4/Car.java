package com.oopsAssignment2.question4;

public class Car extends Vechicle{
	int numberOfDoors;
	String fuelType;
	Car(String vechicleno, String brand, int price, int numberOfDoors,String fuelType){
		super( vechicleno,  brand,  price);
		this.numberOfDoors=numberOfDoors;
		this.fuelType=fuelType;
	}
	void cardetails() {
		vechickledetails();
		System.out.println("the toatal price of car included  insurance : "+(price+(price*0.08)));
	}
	
	
	
}
