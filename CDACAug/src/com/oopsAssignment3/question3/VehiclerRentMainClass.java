package com.oopsAssignment3.question3;
import java.util.Scanner;

public class VehiclerRentMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Car c=new Car("AP 31 d 1159","honda",2500,4,1);
		c.vehicleDetails();
		System.out.println("the toatal rent is : "+c.calculateRent());
		Bike b=new Bike("AP 32 E 7249","TATA",500,2,2);
		b.vehicleDetails();
		System.out.println("the toatal rent is : "+b.calculateRent());
		
		sc.close();

	}

}
