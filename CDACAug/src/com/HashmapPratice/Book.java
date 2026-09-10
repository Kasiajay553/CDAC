package com.HashmapPratice;

public class Book {
int bookId;
String title;
String author;
int price;
public Book(int bookId, String title, String author, int price) {
	super();
	this.bookId = bookId;
	this.title = title;
	this.author = author;
	this.price = price;
}

void displayBookDetails() {
	System.out.printf("the book details [ID : %d, Title : %s, Author:%s, Price : %d]\n",bookId,title,author,price);
}
}
