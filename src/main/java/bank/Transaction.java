package bank;

class Transaction {

    int deposit, withdrawal, balance;
    String date;

    Transaction(String date, int withdrawal, int deposit, int balance){

        this.date = date;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
        this.balance = balance;
    }

}
