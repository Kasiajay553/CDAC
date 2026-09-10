package com.HashmapPratice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashOperation {
	
	Scanner sc=new Scanner(System.in);
	HashMap<Integer, Book> hm = new HashMap<>();
	
	void addBook() {
		System.out.println("Enter the number of books to add : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		while(n != 0) {
		System.out.println("Enter book id :");
		int bookId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter book title : ");
		String title = sc.next();
		System.out.println("Enter author name :");
		String author = sc.next();
		System.out.println("ENter book price :");
		int price = sc.nextInt();
		hm.put(bookId, new Book(bookId, title, author, price));
		n--;
		}
	}
	
	void displayAllBooks() {
		for(Map.Entry<Integer, Book> m : hm.entrySet()) {
			m.getValue().displayBookDetails();
		}
	}
	
	void searchBook() {
		System.out.println("Enter the book ID :");
		int bookId = sc.nextInt();
		
		for(Map.Entry<Integer, Book> m : hm.entrySet()) {
			if(m.getKey() == bookId) {
				System.out.print(m.getKey() + " --->");
				m.getValue().displayBookDetails();
			}
		}
	}
	void updateBook() {
		System.out.println("Enter the book ID :");
		int bookId = sc.nextInt();
		for(Map.Entry<Integer, Book> m : hm.entrySet()) {
			if(m.getKey() == bookId) {
				System.out.println("Enter the title, author and price of the book : ");
				 m.getValue().title= sc.next();
				 m.getValue().author = sc.next();
				 m.getValue().price = sc.nextInt();
			}
			
		}
		System.out.println("book is updated");
	}
	
	void deleteBook() {
		System.out.println("Enter the book ID :");
		int bookId = sc.nextInt();
		for(Map.Entry<Integer, Book> m : hm.entrySet()) {
			if(m.getKey() == bookId) {
				hm.remove(bookId);
			}
			
		}
		System.out.println("Book deleted successfully");
	}
	
	void sortByPrice() {

	    hm.entrySet()
	      .stream()
	      .sorted(Comparator.comparingDouble(
	          (Map.Entry<Integer, Book> e) -> e.getValue().price
	      ).reversed())
	      .forEach(e -> e.getValue().displayBookDetails());
	}

}
