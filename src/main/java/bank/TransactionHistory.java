package bank;

import java.util.ArrayList;

class TransactionHistory {

    ArrayList<Transaction> transactions;

    private PrintStatement statement;

    TransactionHistory() {

        this.transactions = new ArrayList<>();

    }

    void addTransaction(Transaction transaction) {

        transactions.add(0,transaction);
    }

    void printStatement(){

        this.statement = makePrintStatement(transactions);
        statement.print();

    }

    PrintStatement makePrintStatement(ArrayList<Transaction> transactions){
        return new PrintStatement(transactions);
    }

}
