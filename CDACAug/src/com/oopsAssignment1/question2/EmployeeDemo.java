package com.oopsAssignment1.question2;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		Employee emp4=new Employee();
		 
		System.out.println(" ----------the employee 1 details----------------");
		emp1.read();
		emp1.display();
		emp1.calculateBonus();
		System.out.println(" ----------the employee 2 details----------------");
		emp2.read();
		emp2.display();
		emp2.calculateBonus();
		System.out.println(" ----------the employee 3 details----------------");
		emp3.read();
		emp3.display();
		emp3.calculateBonus();
		System.out.println(" ----------the employee 4 details----------------");
		emp4.read();
		emp4.display();
		emp4.calculateBonus();

	}

}
