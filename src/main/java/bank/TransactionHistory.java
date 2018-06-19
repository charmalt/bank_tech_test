package bank;

import java.util.ArrayList;

public class TransactionHistory {

    private ArrayList<Transaction> transactions;

    public TransactionHistory() {
        this.transactions = new ArrayList<>();
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
