import org.junit.Test;

public class AccountTest {

    @Test
    public void newAccountHasDefaultZeroBalance(){

        Account account = new Account();

        assertEquals(account.balance, 0);

    }
}
