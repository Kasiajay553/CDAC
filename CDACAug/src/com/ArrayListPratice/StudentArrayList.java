package com.ArrayListPratice;

public class StudentArrayList {
	int id;
	String name;
	StudentArrayList(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void displayStudents() {
		System.out.printf("the students details are [ID : %d, Name : %s]%n", id, name);
	}

	
}
