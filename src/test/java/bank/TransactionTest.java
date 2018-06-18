package bank;

import bank.Transaction;
import org.junit.Test;


import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

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
