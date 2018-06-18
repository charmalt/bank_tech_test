package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegrationTest {

    private Account account;

    @BeforeEach
    void init(TestInfo testInfo) {
        account = new Account();
        System.out.println("Start..." + testInfo.getDisplayName());
    }

    @Test
    void makeDepositsAndWithdrawals(){

        account.deposit(1000, "12/12/2018");
        account.deposit(300, "12/12/2018");
        account.withdrawal(1000, "12/12/2018");

        assertEquals(account.getBalance(), 300 );
    }
}
