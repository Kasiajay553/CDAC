package com.oopsAssignment3.question2;
import java.util.Scanner;

public class TravelBookingMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("the choice for mode of transport");
		BusBooking busbooking=new BusBooking("ajay","anakaplle","Bengaluru",870,"ac");
		busbooking.travelingdetails();
		
		System.out.println("the total price : "+ busbooking.calculateFare());
		TrainBooking trainbooking=new TrainBooking("ajay","hyderabad","vizag",870,"non ac");
		trainbooking.travelingdetails();
		
		System.out.println("the total price : "+ trainbooking.calculateFare());
		

	}

}
