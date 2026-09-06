package com.oopsAssignment2.question5;

public class Library {
	String libraryName;
	String location;
	Book book;
	static int totalbooks=0;
	Library(String libraryName,String location,Book book){
		this.libraryName=libraryName;
		this.location=location;
		this.book=book;
	}
	void dispalylibrarydeatil() {
		System.out.println("library name : "+libraryName);
		System.out.println("Library Location"+location);
		book.displaybook();
		totalbooks+=1;
	}

}
