package com.oopsAssignment1.question3;

public class Product {
	int productId;
	String name;
	int price;
	int quantity;
	
	Product(int productId,String name,int price,int quantity){
		this.productId=productId;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	void display() {
		System.out.println("the product Id : "+ productId);
		System.out.println("the product name : "+ name);
		System.out.println("the product price : "+ price);
		System.out.println("the product Quantity : "+ quantity);
		 calculateBill(price,quantity);
		
	}
	private void calculateBill(int price, int quantity) {
		int total=price*quantity;
		System.out.println("the product total price : "+total );
		if(total>10000) {
			System.out.println("the discount is 10% : " + total*0.1);
			System.out.println("the Final price : " +( total-(total*0.1)));
		}
		else {
			System.out.println("the discount is 0% : " + 0);
			System.out.println("the Final price : " +total);
		}
		
		
	}

	
}
