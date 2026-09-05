package com.oopsAssignment2.question5;

public class Library {
	String library;
	String location;
	Book book;
	static int totalbook=0;
	Library(String library,String location,Book book){
		this.library=library;
		this.location=location;
		this.book=book;
	}
	void dispalylibrarydeatil() {
		totalbook+=1;
	
		System.out.println("the library name is : "+library);
		System.out.println(("the location of Library is : "+location));
		book.dislayBookdeatail();
	}

}
