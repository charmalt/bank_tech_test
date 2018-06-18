package bank;

import org.junit.Test;
import bank.Account;
import bank.Transaction;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TransactionTest {

    @Test
    public void newTransactionHasDateAttribute(){

        Transaction transaction = new Transaction("24/12/2018", 0, 100, 1000);

        assertEquals(transaction.date, "24/12/2018");

    }

    @Test
    public void newTransactionHasDepositAttribute(){

        Transaction transaction = new Transaction("24/12/2018", 0, 100, 1000);

        assertEquals(transaction.deposit, 0);

    }

    @Test
    public void newTransactionHasWithdrawalAttribute(){

        Transaction transaction = new Transaction("24/12/2018", 0, 100, 1000);

        assertEquals(transaction.withdrawal, 100);

    }

    @Test
    public void newTransactionHasBalanceAttribute(){

        Transaction transaction = new Transaction("24/12/2018", 0, 100, 1000);

        assertEquals(transaction.balance, 1000);

    }

}
