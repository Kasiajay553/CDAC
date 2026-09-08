package com.CollectionsExceptionHandlingAssignment1.Question7;

public class RegistrationValidator {

  
    public void validateAge(int age) throws InvalidAgeException {
       
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        
        if (age < 18) {
            
            throw new InvalidAgeException("Access Denied: You must be at least 18 years old to register for this event. Provided age: " + age);
        }

        System.out.println("Registration Successful! Welcome to the event.");
    }
}