package com.CollectionsExceptionHandlingAssignment1.Question4;

import java.util.Scanner;

public class PassengerManagementMainClass {
    public static void main(String[] args) {
        PassengerManagement management = new PassengerManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Train Passenger Management Menu ---");
            System.out.println("1. Add Passenger at Beginning");
            System.out.println("2. Add Passenger at End");
            System.out.println("3. Remove First Passenger");
            System.out.println("4. Remove Last Passenger");
            System.out.println("5. Search Passenger");
            System.out.println("6. Display Passengers");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter passenger name: ");
                    String nameBeg = scanner.nextLine();
                    management.addPassengerAtBeginning(nameBeg);
                    break;
                case 2:
                    System.out.print("Enter passenger name: ");
                    String nameEnd = scanner.nextLine();
                    management.addPassengerAtEnd(nameEnd);
                    break;
                case 3:
                    management.removeFirstPassenger();
                    break;
                case 4:
                    management.removeLastPassenger();
                    break;
                case 5:
                    System.out.print("Enter passenger name to search: ");
                    String searchName = scanner.nextLine();
                    management.searchPassenger(searchName);
                    break;
                case 6:
                    management.displayPassengers();
                    break;
                case 7:
                    System.out.println("Exiting Train Passenger Management system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
