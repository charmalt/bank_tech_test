package bank;

import java.util.ArrayList;

class PrintStatement {

    ArrayList<Transaction> transactions;

    PrintStatement(ArrayList<Transaction> transactions){
        this.transactions = transactions;
    }

    void print(){

        System.out.printf("%4s || %6s || %5s || %7s\n", "date", "credit", "debit", "balance");

        for (Transaction transaction : this.transactions) {

            printTransaction(transaction);

        }

    }

    private void printTransaction(Transaction transaction){

        String formatter = (transaction.getWithdrawal() == 0.0) ? "%10s || %4.2f || || %4.2f\n" : "%10s || || %4.2f || %4.2f\n";
        double value = (transaction.getWithdrawal() == 0.0) ? transaction.getDeposit() : transaction.getWithdrawal();

        System.out.printf(formatter, transaction.getDate(), value, transaction.getBalance());

    }

}
