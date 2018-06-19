package bank;

import java.util.ArrayList;

class TransactionHistory {

    ArrayList<Transaction> transactions;

    TransactionHistory() {
        this.transactions = new ArrayList<>();
    }

    void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    void printStatement(){

        System.out.printf("%10s %10s %10s %10s", "Date", "Withdrawal", "Deposit", "Balance");
        System.out.println();
        for (Transaction transaction : this.transactions) {
            System.out.printf("%10s %10d %10d %10d", transaction.date, transaction.withdrawal, transaction.deposit, transaction.balance);
            System.out.println();
        }

    }
}
