package com.day1.task_1;

public class Transaction {
    private final String id;
    private final String accountNumber;
    private final double amount;
    private final String type; // "CREDIT" or "DEBIT"

    public Transaction(String id, String accountNumber, double amount, String type) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
    }

    public String getId() { return id; }
    public String getAccountNumber() { return accountNumber; }
    public double getAmount() { return amount; }
    public String getType() { return type; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Transaction other = (Transaction) obj;
        return id.equals(other.id);
    }

    @Override
    public String toString() {
        return String.format("[%s | Acc: %s | %s: USD %.2f]", id, accountNumber, type, amount);
    }
}
