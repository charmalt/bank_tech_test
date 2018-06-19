package bank;

class Transaction {

    float deposit, withdrawal, balance;
    String date;

    Transaction(String date, float withdrawal, float deposit, float balance){

        this.date = date;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
        this.balance = balance;
    }

}
