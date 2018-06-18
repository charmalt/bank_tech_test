import java.util.ArrayList;

public class Account {

    public int balance = 0;
    private ArrayList<Integer> transcations = new ArrayList<Integer>();


    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance){
        balance = newBalance;
    }

    public ArrayList<Integer> getTransactions() {
        return transcations;
    }

    public void deposit(int newDeposit){
        balance += newDeposit;
    }


}
