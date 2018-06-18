import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AccountTest {

    @Test
    public void newAccountHasDefaultZeroBalance(){

        Account account = new Account();

        assertEquals(account.getBalance(), 0);

    }


}
