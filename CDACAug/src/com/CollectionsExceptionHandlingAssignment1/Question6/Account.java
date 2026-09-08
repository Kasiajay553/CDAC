package com.CollectionsExceptionHandlingAssignment1.Question6;

public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
       
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        }

        
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Available balance: $" + balance);
        }

      
        balance -= amount;
        System.out.println("Transaction Successful! Withdrew: $" + amount);
        System.out.println("Remaining Balance: $" + balance);
    }

    
    public double getBalance() {
        return balance;
    }
}
