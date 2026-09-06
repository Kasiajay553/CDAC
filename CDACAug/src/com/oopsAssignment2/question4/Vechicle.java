package com.oopsAssignment2.question4;

public class Vechicle {
	String vechicleno;
	String brand;
	int price;
	static String dealer="C-DAC";
	Vechicle(String vechicleno, String brand, int price){
		this.vechicleno=vechicleno;
		this.brand=brand;
		this.price=price;	
	}
	void vechickledetails() {		
		System.out.println("the vechile dealler : "+dealer);
		System.out.println("the vechile number : "+vechicleno);
		System.out.println("the vechile brand : "+brand);
		System.out.println("the vechile price : "+price);
	}

}
  