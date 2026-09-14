package com.JDBCAndMultithreadingAssignment4.Question2;

public class Mulitithreading extends Thread {

    // Constructor to set the thread name
    public Mulitithreading(String name) {
        super(name);
    }

    // The entry point for each thread execution
    @Override
    public void run() {
        // Route to the correct method based on the thread's assigned name
        if (Thread.currentThread().getName().equals("Even-Thread")) {
            generateEvenNumbers();
        } else if (Thread.currentThread().getName().equals("Prime-Thread")) {
            generatePrimeNumbers();
        }
    }

    // Thread 1 task: Generates even numbers
    void generateEvenNumbers() {
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "  " );
            }
        }
    }

    // Thread 2 task: Generates prime numbers (optimized time complexity)
    void generatePrimeNumbers() {
        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // Exits early to optimize time complexity
                }
            }
            if (isPrime) {
                System.out.println(Thread.currentThread().getName() + "  " );
            }
        }
    }

    // Main execution method
    public static void main(String[] args) {
        // 1. Create the Even Number Thread
        Mulitithreading evenThread = new Mulitithreading("Even-Thread");

        // 2. Create the Prime Number Thread
        Mulitithreading primeThread = new Mulitithreading("Prime-Thread");

        // 3. Start both threads concurrently
        evenThread.start();
        primeThread.start();
    }
}
