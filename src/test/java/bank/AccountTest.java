package bank;

import bank.Account;
import bank.Transaction;
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

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
        Transaction transaction = mock(Transaction.class);

        assertTrue(account.getTransactions().contains(transaction));

    }

}
