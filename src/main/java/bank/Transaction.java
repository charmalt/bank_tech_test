package bank;

class Transaction {

    private float deposit, withdrawal, balance;
    private String date;

    Transaction(String date, float withdrawal, float deposit, float balance){

        this.date = date;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
        this.balance = balance;
    }

    float getDeposit() {
        return deposit;
    }

    float getWithdrawal() {
        return withdrawal;
    }

    float getBalance() {
        return balance;
    }

    String getDate() {
        return date;
    }

}
