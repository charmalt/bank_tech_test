package bank;

import java.util.ArrayList;
import java.util.Collections;

class TransactionHistory {

    ArrayList<Transaction> transactions;

    TransactionHistory() {

        this.transactions = new ArrayList<>();
    }

    void addTransaction(Transaction transaction) {

        transactions.add(transaction);
    }

    void printStatement(){

        System.out.printf("%4s || %6s || %5s || %7s", "date", "credit", "debit", "balance");
        System.out.println();

        ArrayList<Transaction> transactions1 = this.transactions;

        for (int i = transactions1.size() - 1; i >= 0 ; i--) {

            Transaction transaction = transactions1.get(i);

            String formatter = (transaction.withdrawal == 0.0) ? "%10s || %4.2f || || %4.2f" : "%10s || || %4.2f || %4.2f";

            if (transaction.withdrawal == 0) {
                System.out.printf(formatter, transaction.date, transaction.deposit, transaction.balance);
            } else {
                System.out.printf(formatter, transaction.date, transaction.withdrawal, transaction.balance);
            }

            System.out.println();
        }

    }
}
