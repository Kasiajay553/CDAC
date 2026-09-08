package com.CollectionsExceptionHandlingAssignment1.Question5;

import java.util.Scanner;

public class PatientManagementMainClass {
    public static void main(String[] args) {
        PatientManagement system = new PatientManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Hospital Patient Management Menu ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Treat Patient");
            System.out.println("3. View Next Patient");
            System.out.println("4. Display Waiting Patients");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter patient's name: ");
                    String name = scanner.nextLine();
                    system.addPatient(name);
                    break;
                case 2:
                    system.treatPatient();
                    break;
                case 3:
                    system.viewNextPatient();
                    break;
                case 4:
                    system.displayPatients();
                    break;
                case 5:
                    System.out.println("Exiting System. Good health to all!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number from 1 to 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
