package com.CollectionsExceptionHandlingAssignment1.Question2;
import java.util.*;

public class BookManagement {
	
	HashMap<Integer, Book> hashmap = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	
	
	void addBook() {
		System.out.println("enter the number of books you wants to add : ");
		int numbook = sc.nextInt();
		for(int i = 0; i < numbook; i++) {
			try {
				System.out.println("enter the book Id ");
				int bookId = sc.nextInt();
				sc.nextLine(); 
				
				System.out.println("enter the book title ");
				String title = sc.nextLine();
				
				System.out.println("enter the book author ");
				String author = sc.nextLine();
				
				System.out.println("enter the price ");
				int price = sc.nextInt();
				sc.nextLine(); 
				
				if (price <= 0 || bookId <= 0 || title.isEmpty() || author.isEmpty()) {
					throw new Customexception();
				}
				
				hashmap.put(bookId, new Book(bookId, title, author, price));
				System.out.println("Book added successfully!");
			} catch(Customexception e){
				System.out.println("Error: " + e.getMessage()); 
				System.out.println("Please try entering this book details again.\n");
				i--; 
			}
		}
	}
	
	void displayAllBooks() {
		if (hashmap.isEmpty()) {
			System.out.println("No books available in the library.");
			return;
		}
		for (Map.Entry<Integer, Book> hm : hashmap.entrySet()) {
			System.out.println("Key: " + hm.getKey());
			System.out.println("Book details : ");
			hm.getValue().display();
		}
	}

	void searchBook() {
		System.out.println("Enter Book ID to search: ");
		int id = sc.nextInt();
		if(hashmap.containsKey(id)) {
			hashmap.get(id).display();
		} else {
			System.out.println("Book not found with ID: " + id);
		}
	}

	void updateBook() {
		System.out.println("Enter Book ID to update: ");
		int id = sc.nextInt();
		sc.nextLine(); 
		if(hashmap.containsKey(id)) {
			Book book = hashmap.get(id);
			System.out.println("Enter new Title: ");
			book.setTitle(sc.nextLine());
			System.out.println("Enter new Author: ");
			book.setAuthor(sc.nextLine());
			System.out.println("Enter new Price: ");
			book.setPrice(sc.nextInt());
			System.out.println("Book updated successfully!");
		} else {
			System.out.println("Book not found with ID: " + id);
		}
	}

	void deleteBook() {
		System.out.println("Enter Book ID to delete: ");
		int id = sc.nextInt();
		if(hashmap.containsKey(id)) {
			hashmap.remove(id);
			System.out.println("Book deleted successfully!");
		} else {
			System.out.println("Book not found with ID: " + id);
		}
	}
}
