import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AccountTest {

    @Test
    public void newAccountHasDefaultZeroBalance(){

        Account account = new Account();

        assertEquals(account.getBalance(), 0);

    }

    @Test
    public void setAccountBalance(){

        Account account = new Account();
        account.setBalance(100);

        assertEquals(account.getBalance(), 100);
    }


}
