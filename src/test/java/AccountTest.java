import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

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

    @Test
    public void transactionHistoryInitializedToEmpty(){

        Account account = new Account();
        assertThat(account.getTransactions(), IsEmptyCollection.empty());

    }

    @Test
    public void setNewBalanceOnDeposit(){

        Account account = new Account();
        account.deposit(100);
        assertEquals(account.getBalance(), 100);

    }

    @Test
    public void setNewBalanceOnWithdrawal(){

        Account account = new Account();
        account.deposit(100);
        account.withdrawal(100);
        assertEquals(account.getBalance(), 0);
    }

    @Test
    public void saveNewTransaction(){
        Account account = new Account();
        account.deposit(100);


    }

}
