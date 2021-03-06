package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TransactionTest {

    private Transaction transaction;

    @BeforeEach
    void init(TestInfo testInfo) {

        transaction = new Transaction("24/12/2018", 100, 0, 1000.50);
        System.out.println("Start..." + testInfo.getDisplayName());
    }

    @Test
    void newTransactionHasDateAttribute(){

        assertEquals(transaction.getDate(), "24/12/2018");
    }

    @Test
    void newTransactionHasDepositAttribute(){

        assertEquals(transaction.getDeposit(), 0);
    }

    @Test
    void newTransactionHasWithdrawalAttribute(){

        assertEquals(transaction.getWithdrawal(), 100);
    }

    @Test
    void newTransactionHasBalanceAttribute(){

        assertEquals(transaction.getBalance(), 1000.50);
    }
}
