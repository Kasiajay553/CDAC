package com.oopsAssignment2.question4;

public class Bike extends Vechicle{
	int enginecc;
	boolean helmetInculded;
	Bike(String vechicleno, String brand, int price, int enginecc,boolean helmetInculded){
		super(vechicleno,brand,price);
		this.enginecc=enginecc;
		this.helmetInculded=helmetInculded;
	}
	void bikedetails() {
		vechickledetails();
		System.out.println("the toatal price of BIKE included  insurance : "+(price+(price* 0.05)));
	}
}
