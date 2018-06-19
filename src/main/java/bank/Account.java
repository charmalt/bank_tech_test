package bank;

import java.util.ArrayList;

class Account {

    private int balance = 0;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    private Transaction transaction;

    int getBalance() {
        return balance;
    }

    ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    void deposit(int newDeposit, String date){
        balance += newDeposit;
        transactions.add(makeTransaction(date,0 , newDeposit, balance));
    }

    void withdrawal(int newWithdrawal, String date){
        balance -= newWithdrawal;
        transactions.add(makeTransaction(date, newWithdrawal, 0, balance));
    }

    Transaction makeTransaction(String date, int newWithdrawal, int newDeposit, int balance){
        return new Transaction(date, newWithdrawal, newDeposit, balance);
    }

}
