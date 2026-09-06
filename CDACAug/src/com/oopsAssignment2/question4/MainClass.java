package com.oopsAssignment2.question4;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Car[] carobj=new Car[2];
		Bike[] bikeobj=new Bike[2];
		for(int i=0;i<2;i++) {
			System.out.println("--------enter the Car details-----");
			System.out.println("Vehicle number : ");
			String vehcileno=sc.next();
			System.out.println(" Brand name : ");
			String brand=sc.next();
			System.out.println("price oif the car : ");
			int price=sc.nextInt();
			System.out.println("nuber of doors : ");
			int numberOfDoors=sc.nextInt();
			System.out.println("fuel type : ");
			String fuelType=sc.next();
			carobj[i]=new Car(vehcileno, brand,  price,  numberOfDoors,fuelType);
			carobj[i].cardetails();
			
		}
		
		for(int i=0;i<2;i++) {
			System.out.println("--------enter the Bike details-----");
			System.out.println("Vehicle number : ");
			String vehcileno=sc.next();
			System.out.println(" Brand name : ");
			String brand=sc.next();
			System.out.println("price oif the car : ");
			int price=sc.nextInt();
			System.out.println("cc of the bike ");
			int bikecc=sc.nextInt();
			System.out.println("helmet inculde ");
			boolean helmetInculded=sc.nextBoolean();
			bikeobj[i]=new Bike(vehcileno, brand,  price, bikecc,helmetInculded);
			bikeobj[i].bikedetails();
			
		}
		
	}

}
