package bank;

import java.util.ArrayList;

public class Account {

    public int balance = 0;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();


    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance){
        balance = newBalance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void deposit(int newDeposit){
        balance += newDeposit;

    }

    public void withdrawal(int newWithdrawal){
        balance -= newWithdrawal;
    }


}
