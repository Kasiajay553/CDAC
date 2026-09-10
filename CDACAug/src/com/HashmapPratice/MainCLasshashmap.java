package com.HashmapPratice;
import java.util.*;

public class MainCLasshashmap {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		HashOperation h = new HashOperation();
		
		while(true) {
			System.out.println("Menu : \n1. Add Book\n2. Display Books\n3. Search Book\n4. Update Book\n5. Delete Book\n6. Sort by marks\n7. Exit");
			int n = sc.nextInt();
			switch(n) {
			case 1 :
				h.addBook();
				break;
			case 2 :
				h.displayAllBooks();
				break;
			case 3 :
				h.searchBook();
				break;
			case 4 :
				h.updateBook();
				break;
			case 5:
				h.deleteBook();
				break;
			case 7:
				System.exit(0);
			case 6 :
				h.sortByPrice();
				break;
				default :
					System.out.println("Enter the valid numbers ");
			}
			
		}


	}
}
//package HashmapPratice;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class MainClasshashmap {
//    public static void main(String[] args) {
//        HashOperation catalog = new HashOperation();
//        Scanner scanner = new Scanner(System.in);
//        boolean running = true;
//
//        System.out.println("Welcome to the Book Management System!");
//
//        while (running) {
//            System.out.println("\n1. Add Book\n2. Search Book\n3. Remove Book\n4. View All Books\n5. Exit");
//            System.out.print("Enter your choice: ");
//
//            int choice;
//            try {
//                choice = scanner.nextInt();
//                scanner.nextLine(); // Clear the newline character buffer
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid choice input! Please enter a number between 1 and 5.");
//                scanner.nextLine(); // Clear the invalid string buffer
//                continue;
//            }
//
//            switch (choice) {
//                case 1:
//                    try {
//                        System.out.print("Enter Book ID (Integer): ");
//                        int id = scanner.nextInt();
//                        scanner.nextLine(); // Clear buffer
//
//                        System.out.print("Enter Book Title: ");
//                        String title = scanner.nextLine();
//
//                        System.out.print("Enter Book Author: ");
//                        String author = scanner.nextLine();
//
//                        Book newBook = new Book(title, author);
//                        catalog.addBook(id, newBook);
//                    } catch (InputMismatchException e) {
//                        System.out.println("Invalid input! Book ID must be an integer numeric value.");
//                        scanner.nextLine(); // Clear the bad scanner token
//                    }
//                    break;
//
//                case 2:
//                    try {
//                        System.out.print("Enter Book ID to search: ");
//                        int searchId = scanner.nextInt();
//                        Book foundBook = catalog.getBook(searchId);
//                        System.out.println("Found Details -> " + foundBook);
//                    } catch (InputMismatchException e) {
//                        System.out.println("Invalid input! ID must be a number.");
//                        scanner.nextLine();
//                    } catch (BookNotFoundException e) {
//                        System.out.println(e.getMessage());
//                    }
//                    break;
//
//                case 3:
//                    try {
//                        System.out.print("Enter Book ID to remove: ");
//                        int removeId = scanner.nextInt();
//                        catalog.removeBook(removeId);
//                    } catch (InputMismatchException e) {
//                        System.out.println("Invalid input! ID must be a number.");
//                        scanner.nextLine();
//                    } catch (BookNotFoundException e) {
//                        System.out.println(e.getMessage());
//                    }
//                    break;
//
//                case 4:
//                    catalog.displayAllBooks();
//                    break;
//
//                case 5:
//                    running = false;
//                    System.out.println("Exiting Application. Goodbye!");
//                    break;
//
//                default:
//                    System.out.println("Please select a valid option from the menu (1-5).");
//            }
//        }
//        scanner.close();
//    }
//}
