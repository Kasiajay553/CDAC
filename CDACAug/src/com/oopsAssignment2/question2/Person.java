package com.oopsAssignment2.question2;

public class Person {
	String name ;
	int age;
	static String organizationname="dac";
	Person(String name,int age){
		this.name =name;
		this.age=age;
	}
	void display() {
		System.out.println("name of the person : "+name);
		System.out.println("age of the person : "+age);
		System.out.println("name of the organization is : "+organizationname);
	}

}
