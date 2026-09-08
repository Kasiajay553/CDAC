package com.packageCollectionException.Assignment1Question2;

import java.util.*;

public class BookManagementUsingHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookManagement bm = new BookManagement();
		while(true) {
			System.out.println("\n--- Library Menu ---");
			System.out.println("choice->1 for add Book");
			System.out.println("choice->2 for Display All Books");
			System.out.println("choice->3 for Search Book by ID");
			System.out.println("choice->4 for Update Book");
			System.out.println("choice->5 for Delete Book");
			System.out.println("choice->6 for Exit");
			System.out.println("Enter your choice above options: ");
			try {
				int ch = sc.nextInt();
				switch(ch) {
				case 1:
					bm.addBook();
					break;
				case 2:
					bm.displayAllBooks();
					break;
				case 3:
					bm.searchBook();
					break;
				case 4:
					bm.updateBook(); // Added parenthesis
					break;
				case 5:
					bm.deleteBook();
					break;
				case 6:
					System.out.println("Exiting application...");
					System.exit(0);
				default :
					System.out.println("Invalid choice");
				}
			} catch(Exception e) {
				System.out.println("Invalid input type! Please enter numbers only.");
				sc.nextLine(); // CRUCIAL: Clears the bad input token to prevent infinite loop
			}
		}
	}
}
