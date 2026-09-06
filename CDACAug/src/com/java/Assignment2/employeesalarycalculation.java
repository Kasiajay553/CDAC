package com.java.Assignment2;
import java.util.Scanner;

public class employeesalarycalculation {
	static float calculatesalary(float a) {
		if(a>=50000) {
			return a+(a*0.2f);
		}
		else {
			return a+(a*0.1f);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		float salary= sc.nextFloat();
		float finalsalary=calculatesalary(salary);
		System.out.println("final salarty is : "+ finalsalary);
	}

}
