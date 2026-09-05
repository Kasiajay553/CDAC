package com.oopsAssignment2.question5;

public class Book {
	int bookId;
	String title;
	String author;
	int price;
	Book(int bookId,String title,String author,int price){
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void dislayBookdeatail() {
		System.out.println("the book Id is : "+bookId);
		System.out.println("the book title is : "+title);
		System.out.println("the book author is : "+author);
		System.out.println("the book price is : "+price);
	}

}
