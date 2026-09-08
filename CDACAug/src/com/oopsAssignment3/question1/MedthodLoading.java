package com.oopsAssignment3.question1;

import java.util.Scanner;

public class MedthodLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("enter 1 for the single item");
		System.out.println("enter 2 for the order mulitple items");
		System.out.println("enter 3 for the home delivery");
		int choice=sc.nextInt();
		FoodOrder fo= new FoodOrder();
		switch(choice) {
		case 1:
			System.out.println("enter the price of the food");
			int foodcost=sc.nextInt();
			
			fo.calculateBill(foodcost);
			break;
		case 2:
			System.out.println("enter the price of the food");
			int foodcost1=sc.nextInt();
			System.out.println("enter quantity you want to buy ");
			int quantity=sc.nextInt();
			fo.calculateBill(foodcost1,quantity);
			break;
		case 3:
			System.out.println("enter the price of the food");
			int foodcost2=sc.nextInt();
			sc.nextLine();
			System.out.println("enter quantity you want to buy ");
			int quantity1=sc.nextInt();
			System.out.println("enter devlivery charge ");
			int delivery=sc.nextInt();
			fo.calculateBill(foodcost2,quantity1,delivery);
			break;
			default:
				System.out.println("invaild input");
		}

	}

}