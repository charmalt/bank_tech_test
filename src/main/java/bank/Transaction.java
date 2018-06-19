package bank;

class Transaction {

    private double deposit, withdrawal, balance;
    private String date;

    Transaction(String date, double withdrawal, double deposit, double balance){

        this.date = date;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
        this.balance = balance;
    }

    double getDeposit() {
        return deposit;
    }

    double getWithdrawal() {
        return withdrawal;
    }

    double getBalance() {
        return balance;
    }

    String getDate() {
        return date;
    }

}
