package Lecture2.Bank;

import java.util.ArrayList;

public class Account {
    private static int i;
    private final int id;
    private String name;
    private int balance;

    private ArrayList<String> transactions = new ArrayList<String>();

    public Account(String name, int balance) {
        this.id = ++i;
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() { return balance; }
    public int getId() { return id; }
    public String getName() { return name; }
    public ArrayList<String> getTransactions() { return transactions; }

    public boolean withdraw(int amount) {
        if (amount < balance) {
            balance -= amount;
            transactions.add(amount + "dkk was withdrawn from the account. New balance is " + balance + "dkk");
            return true;
        } else {
            System.out.println("Cannot withdraw money from the account " + name + ": Insufficient funds");
            return false;
        }
    }

    public void deposit(int amount) {
        balance += amount;
        transactions.add(amount + "dkk was deposited to the account. New balance is " + balance + "dkk");
    }
}
