package bank;

import java.util.ArrayList;

class Account {

    private int balance = 0;

    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();


    int getBalance() {
        return balance;
    }

    void setBalance(int newBalance){
        balance = newBalance;
    }

    ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    void deposit(int newDeposit, String date){
        balance += newDeposit;
        transactions.add(makeTransaction(date, newDeposit, 0, balance));
    }

    void withdrawal(int newWithdrawal){
        balance -= newWithdrawal;
    }

    private Transaction makeTransaction(String date, int newDeposit, int newWithdrawal, int balance){
        return new Transaction(date, newDeposit, 0, balance);
    }


}
