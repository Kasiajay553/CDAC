package com.oopsAssignment2.question2;

public class Managers extends Employee {
	String department;
	int teamSize;
	Managers(String name,int age,int empId,int salary,String department,int teamSize){
		super(name,age,empId,salary);
		this.department=department;
		this.teamSize=teamSize;
	}
	
	void displaymanager() {
		displayemp();
		System.out.println("department name is : "+department);
		System.out.println("team size is : "+teamSize);
		System.out.println("annual salary is : "+salary*12);
	
	}

}
