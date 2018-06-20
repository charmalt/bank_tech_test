package bank;

import java.util.ArrayList;

class PrintStatement {

    private ArrayList<Transaction> transactions;

    PrintStatement(ArrayList<Transaction> transactions){
        this.transactions = transactions;
    }

    void print(){
        System.out.printf("%4s || %6s || %5s || %7s\n", "date", "credit", "debit", "balance");

        for (Transaction transaction : this.transactions) {
            System.out.printf(formatter(transaction), transaction.getDate(), value(transaction), transaction.getBalance());
        }
    }

    private String formatter(Transaction transaction){
        return (transaction.getWithdrawal() == 0.0) ? "%10s || %4.2f || || %4.2f\n" : "%10s || || %4.2f || %4.2f\n";
    }

    private double value(Transaction transaction){
        return (transaction.getWithdrawal() == 0.0) ? transaction.getDeposit() : transaction.getWithdrawal();
    }

}
