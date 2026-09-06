package com.oopsAssignment1.question5;

public class ElectricityBill {
	int consumerNo;
	String consumerName;
	int units;
	public ElectricityBill(int consumerNo,String consumerName,int units){
		this.consumerNo=consumerNo;
		this.consumerName=consumerName;
		this.units=units;
	}
	void display() {
		System.out.println("the consumer Number : "+consumerNo);
		System.out.println("the consumer Name : "+consumerName);
		System.out.println("the consumer units : "+units);
		System.out.println("the Bill amount : "+ calculateBill(units));
	}
	int calculateBill(int units) {
		if(units<=100) {
			return units*2;
		}
		else if(units>100 && units<=200) {
			return units*3;
		}
		else if(units>200 && units<=300) {
			return units*5;
		}
		else {
			return units*7;
		}
	}

}
