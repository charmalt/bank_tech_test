package bank;

import java.util.ArrayList;

class TransactionHistory {

    ArrayList<Transaction> transactions;

    TransactionHistory() {

        this.transactions = new ArrayList<>();
    }

    void addTransaction(Transaction transaction) {

        transactions.add(0,transaction);
    }

    void printStatement(){

        System.out.printf("%4s || %6s || %5s || %7s\n", "date", "credit", "debit", "balance");

        for (Transaction transaction : this.transactions) {

            print(transaction);

        }

    }

    private void print(Transaction transaction){

        String formatter = (transaction.getWithdrawal() == 0.0) ? "%10s || %4.2f || || %4.2f\n" : "%10s || || %4.2f || %4.2f\n";
        double value = (transaction.getWithdrawal() == 0.0) ? transaction.getDeposit() : transaction.getWithdrawal();

        System.out.printf(formatter, transaction.getDate(), value, transaction.getBalance());

    }
}
