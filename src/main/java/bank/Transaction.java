package bank;

import java.util.ArrayList;

public class Transaction {

    int deposit, withdrawal, balance;
    String date;

    public Transaction(String date, int deposit, int withdrawal, int balance){

        this.date = date;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
        this.balance = balance;
    }


}
