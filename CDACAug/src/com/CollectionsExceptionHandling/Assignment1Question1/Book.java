package com.CollectionsExceptionHandling.Assignment1Question1;

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
	void display() {
		System.out.printf("The book details [ID : %d, Title : %s, Author : %s, Price : %d]\n",bookId,title,author,price);
	}
}
