package com.CollectionsExceptionHandlingAssignment1.Question7;

import java.util.Scanner;

public class AgeValidationMainClass {
    public static void main(String[] args) {
        RegistrationValidator validator = new RegistrationValidator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Event Registration Portal ---");
        System.out.print("Please enter your age: ");
        
        int userAge = scanner.nextInt();

       
        try {
            System.out.println("Verifying eligibility...");
            validator.validateAge(userAge);
            
        } catch (InvalidAgeException e) {
          
            System.out.println("Registration Error: " + e.getMessage());
            
        } catch (IllegalArgumentException e) {
           
            System.out.println("Input Error: " + e.getMessage());
            
        } finally {
            
            scanner.close();
            System.out.println("Thank you for using the registration portal.");
        }
    }
}