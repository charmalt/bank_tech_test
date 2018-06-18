package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegrationTest {

    private Account account;

    @BeforeEach
    void init(TestInfo testInfo) {
        account = new Account();
        account.deposit(1000, "12/12/2018");

        System.out.println("Start..." + testInfo.getDisplayName());
    }

    @Test
    void makeDepositsAndWithdrawals(){

        account.deposit(300, "12/12/2018");
        account.withdrawal(1000, "12/12/2018");

        assertEquals(account.getBalance(), 300 );
    }

    @Test
    void saveTransaction(){

        Transaction transaction = account.getTransactions().get(0);

        assertEquals(1000, transaction.balance);
        assertEquals("12/12/2018", transaction.date);
        assertEquals(1000, transaction.deposit);
        assertEquals(0, transaction.withdrawal);

    }
}
