package com.oopsAssignment3.question1;



public class FoodOrder {
	int foodcost;
	int quantity;
	int deliverycharge;
	
	 void calculateBill(int foodcost,int quantity,int deliverycharge){
		System.out.println("the total cost is : "+((foodcost*quantity)+deliverycharge));
	}
	 void calculateBill(int foodcost,int quantity){
			System.out.println("the total cost is : "+(foodcost*quantity));
	}
	 void calculateBill(int foodcost){
			System.out.println("the total cost is : "+(foodcost));
	}

}