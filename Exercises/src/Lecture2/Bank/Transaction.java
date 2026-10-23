package Lecture2.Bank;

public class Transaction {
    private static Transaction instance = null;

    public Transaction get() {
        if (instance == null)
            instance = new Transaction();
        return instance;
    }

    public void transactionToFrom(Account p1, Account p2, int amount) {
        try {
            if (p1 == null || p2 == null) { throw new NullPointerException("None of the accounts can be null"); }

            if (p2.getBalance() < amount) {
                p2.addTransactionStatement("User " + p2.getName() + " tried to transfer " + amount + "dkk to " + p1.getName() + " but had insufficient funds");
                return;
            }

            p1.addTransactionStatement(p1.getName() + " received " + amount + "dkk from " + p2.getName()); p1.receiveTransfer(amount);
            p2.addTransactionStatement(p2.getName() + " sent " + amount + "dkk to " + p1.getName()); p2.sendTransfer(amount);
        }
        catch (NullPointerException ex) {
            System.out.println("NullPointerException was caught with the following message: " + ex.getMessage());
        }

    }
}
