package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TransactionTest {

    private Transaction transaction;

    @BeforeEach
    void init(TestInfo testInfo) {

        transaction = new Transaction("24/12/2018", 100, 0, 1000);
        System.out.println("Start..." + testInfo.getDisplayName());
    }

    @Test
    void newTransactionHasDateAttribute(){

        assertEquals(transaction.date, "24/12/2018");
    }

    @Test
    void newTransactionHasDepositAttribute(){

        assertEquals(transaction.deposit, 0);
    }

    @Test
    void newTransactionHasWithdrawalAttribute(){

        assertEquals(transaction.withdrawal, 100);
    }

    @Test
    void newTransactionHasBalanceAttribute(){

        assertEquals(transaction.balance, 1000);
    }
}
