package bank;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {

    private Account account;

    @BeforeEach
    void init(){
        account = new Account();
    }

    @Test
    public void makeDepositsAndWithdrawals(){

        account.deposit(1000, "12/12/2018");
        account.deposit(300, "12/12/2018");
        account.withdrawal(1000);

        assertEquals(account.getBalance(), 300 );
    }
}
