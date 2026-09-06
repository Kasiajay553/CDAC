package com.oopsAssignment2.question2;

public class Employee extends Person {
	int empId;
	int salary;
	Employee(String name,int age,int empId,int salary){
		super(name,age);
		this.empId=empId;
		this.salary=salary;
	}
	void displayemp() {
		display();
		System.out.println("employee id is : "+empId);
		System.out.println("employee  salary is : "+salary);
		
	}
}
