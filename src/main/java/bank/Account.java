package bank;

class Account {

    private int balance = 0;
    private TransactionHistory transactions;

    Account(TransactionHistory transactionHistory){
        this.transactions = transactionHistory;
    }

    int getBalance() {
        return balance;
    }

    void print(){
        transactions.printStatement();
    }

    void deposit(int newDeposit, String date){
        balance += newDeposit;
        transactions.addTransaction(makeTransaction(date,0 , newDeposit, balance));
    }

    void withdrawal(int newWithdrawal, String date){
        balance -= newWithdrawal;
        transactions.addTransaction(makeTransaction(date, newWithdrawal, 0, balance));
    }

    Transaction makeTransaction(String date, int newWithdrawal, int newDeposit, int balance){
        return new Transaction(date, newWithdrawal, newDeposit, balance);
    }

}
