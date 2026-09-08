package com.CollectionsExceptionHandlingAssignment1.Question6;

import java.util.Scanner;

public class BankWithdrawalMainClass {
    public static void main(String[] args) {
  
        Account myAccount = new Account("ACC123456", "John Doe", 1000.0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Account Withdrawal System");
        System.out.println("Current Account Balance: $" + myAccount.getBalance());
        System.out.print("Enter amount to withdraw: ");
        
        double amount = scanner.nextDouble();

        try {
            System.out.println("\nProcessing withdrawal request...");
            myAccount.withdraw(amount);
            
        } catch (IllegalArgumentException e) {
            // Catches invalid input scenarios (negative values or zero)
            System.out.println("Invalid Input Error: " + e.getMessage());
            
        } catch (InsufficientFundsException e) {
          
            System.out.println("Account Error: " + e.getMessage());
            
        } finally {
            
            System.out.println("----------------------------------------------");
            System.out.println("Final Account Status Balance: $" + myAccount.getBalance());
            System.out.println("Thank you for using our banking services.");
            scanner.close();
        }
    }
}
