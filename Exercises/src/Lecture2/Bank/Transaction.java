package Lecture2.Bank;

public class Transaction {
    private static Transaction instance = null;

    public Transaction get() {
        if (instance == null)
            instance = new Transaction();
        return instance;
    }

    public void transactionToFrom(Account p1, Account p2, int amount) {
        if (p2.getBalance() < amount) {
            p2.addTransactionStatement("User " + p2.getName() + " tried to transfer " + amount + "dkk to " + p1.getName + " but had insufficient funds");
        }
    }
}
