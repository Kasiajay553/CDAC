package com.oopsAssignment2.question1;

public class Employee {
	int empId;
	String empname;
	int salary;
	static String companyname="C-DAC";
	Employee(int empId,String empname,int salary){
		this.empId=empId;
		this.empname=empname;
		this.salary=salary;
		
	}
	public void display() {
		System.out.println("The company name : "+companyname);
		System.out.println("the employee Id : "+empId);
		System.out.println("the employee name : "+empname);
		System.out.println("the  salary of each empolyee : "+ salary);
	}
	

}
