package com.CollectionsExceptionHandling.Assignment1Question1;
import java.util.*;

public class BookManagnment {
	Scanner sc=new Scanner(System.in);
	 ArrayList<Book> arrOfBookRef=new ArrayList<>();
	 
	 void addBook() {
		 System.out.println("enter the number of books you to enter: ");
		 int numbooks=sc.nextInt();
		 for(int i=0;i<numbooks;i++) {
			 System.out.println("enter the book Id ");
			 int bookId=sc.nextInt();
			 System.out.println("enter the title of the book ");
			 String title=sc.next();
			 System.out.println("enter the author ");
			 String author=sc.next();
			 System.out.println("enter the price ");
			 int price=sc.nextInt();
			 arrOfBookRef.add(new Book(bookId,title,author,price));
		 }
	 }
	 
	 
	 void displayAllBooks() {
		 if(arrOfBookRef.isEmpty()) {
			 System.out.println("No book is present");
		 }
		 else {
			 for(Book ele: arrOfBookRef) {
				 ele.display();
			 }
		 }
	 }
	 
	 
	 void searchBookById() {
		 System.out.println("enter the Id to search book : ");
		 int searchid=sc.nextInt();
		 boolean found=false;
		 for(Book ele: arrOfBookRef) {
			 if(ele.bookId==searchid) {
				 ele.display();
				 found=true;
				 break;
			 }
			 
		 }
		if(found==false) {
			System.out.println("the book is not found");
		}
	 }
	 
	 
	 void updateBook() {
		 System.out.println("enter the Id to update book : ");
		 int updateid=sc.nextInt();
		 boolean found=false;
		 for(Book ele: arrOfBookRef) {
			 if(ele.bookId==updateid) {
				 System.out.println("enter title : ");
				 String title=sc.next();
				 System.out.println("enter title : ");
				 String author=sc.next();
				 System.out.println("enter title : ");
				 int price=sc.nextInt();
				 ele.title=title;
				 ele.author=author;
				 ele.price=price;
				 System.out.println("the updation completed");
				 found=true;
				 break;
			 }
			 
		 }
		if(found==false) {
			System.out.println("the book is not found");
		}
	 }
	 
	 
	 void deleteBook() {
		 System.out.println("enter the Id to update book : ");
		 int updateid=sc.nextInt();
		 
		 int pos=-1;
		 for(Book ele: arrOfBookRef) {
			
			 if(ele.bookId==updateid) {
				 pos=arrOfBookRef.indexOf(ele);
				 
				 break;
			 }
			 
		 }
		 
		if(pos==-1) {
			System.out.println("the book is not found");
		}
		else {
			arrOfBookRef.remove(pos);
		}
	 }
	

}
