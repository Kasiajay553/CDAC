package com.CollectionsExceptionHandlingAssignment1.Question3;

import java.util.Scanner;

public class BrowserHistoryMainClass {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Browser History Menu ---");
            System.out.println("1. Visit New Page");
            System.out.println("2. Go Back");
            System.out.println("3. View Current Page");
            System.out.println("4. Display History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter URL to visit: ");
                    String url = scanner.nextLine();
                    browser.visitPage(url);
                    break;
                case 2:
                    browser.goBack();
                    break;
                case 3:
                    browser.viewCurrentPage();
                    break;
                case 4:
                    browser.displayHistory();
                    break;
                case 5:
                    System.out.println("Exiting browser history simulation.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
