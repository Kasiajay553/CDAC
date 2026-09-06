package com.oopsAssignment2.question1;

public class Manager extends Employee {
	String department;
	int teamsize;
	Manager(int empId,String empname,int salary,String department,int teamsize){
		super(empId,empname,salary);
		this.department=department;
		this.teamsize=teamsize;
	}
	void displaydetails() {
		display();
		System.out.println("the deparment is : "+department);
		System.out.println("the teamesize : "+teamsize);
		System.out.println("the total salary : "+salary*teamsize);
	}

}
