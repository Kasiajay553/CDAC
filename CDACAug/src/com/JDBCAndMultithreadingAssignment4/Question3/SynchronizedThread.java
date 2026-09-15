package com.JDBCAndMultithreadingAssignment4.Question3;

import java.util.Scanner;

class Account {
    
    private int balance = 1000;

    public synchronized void upiPayment(int amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing: " + amount);
        balance += amount;
        System.out.println("UPI Deposit Done. Current Balance: " + balance);
        System.out.println("----------------------------------------");
    }

    public synchronized void atmWithdrawal(int amount) {
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw: " + amount);
        if (balance >= amount) {
            balance -= amount;
            System.out.println("ATM Withdrawal Done. Current Balance: " + balance);
        } else {
            System.out.println("ATM Withdrawal Failed: Insufficient funds! Balance is: " + balance);
        }
        System.out.println("----------------------------------------");
    }

    public int getBalance() {
        return balance;
    }
}

class UpiTask implements Runnable {
    private Account account;
    private int amount;

    public UpiTask(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.upiPayment(amount);
    }
}

class AtmTask implements Runnable {
    private Account account;
    private int amount;

    public AtmTask(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.atmWithdrawal(amount);
    }
}

public class SynchronizedThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Account sharedAccount = new Account();
        System.out.println("Initial Bank Balance: 1000");

       
        System.out.print("Enter UPI deposit amount: ");
        int upiAmount = sc.nextInt();

        System.out.print("Enter ATM withdrawal amount: ");
        int atmAmount = sc.nextInt();
        
        sc.close();
        UpiTask upiTask = new UpiTask(sharedAccount, upiAmount);
        AtmTask atmTask = new AtmTask(sharedAccount, atmAmount);

        // Assign tasks to separate threads
        Thread thread1 = new Thread(upiTask, "Thread-1 (UPI)");
        Thread thread2 = new Thread(atmTask, "Thread-2 (ATM)");

        thread1.start();
        thread2.start();

       
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        
        System.out.println("ALL TRANSACTIONS COMPLETE.");
        System.out.println("Final Account Balance: " + sharedAccount.getBalance());
    }
}
