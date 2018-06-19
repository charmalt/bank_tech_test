package bank;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;


@RunWith(MockitoJUnitRunner.class)
class AccountTest {

    private Account account;

    @BeforeEach
    void init(TestInfo testInfo) {
        account = new Account();
        System.out.println("Start..." + testInfo.getDisplayName());
    }


    @Test
    void newAccountHasDefaultZeroBalance(){

        assertEquals(account.getBalance(), 0);
    }

    @Test
    void transactionHistoryInitializedToEmpty(){

        assertThat(account.getTransactions(), IsEmptyCollection.empty());
    }

    @Test
    void setNewBalanceOnDeposit(){

        account.deposit(100, "12/01/2018");

        assertEquals(account.getBalance(), 100);
    }

    @Test
    void setNewBalanceOnWithdrawal(){

        account.deposit(100, "12/01/2018");
        account.withdrawal(100, "13/01/2018");

        assertEquals(account.getBalance(), 0);
    }

    @Mock
    private Transaction mockTransaction;

    @Spy
    private Account accountSpy;

    @Test
    void makeNewTransaction(){

        mockTransaction = Mockito.mock(Transaction.class);
        accountSpy = Mockito.spy(new Account());
        accountSpy.deposit(100, "12/01/2018");

        Mockito.doReturn(mockTransaction).when(accountSpy).makeTransaction( anyString(), anyInt(),
                anyInt(), anyInt());

        assertEquals(mockTransaction, accountSpy.makeTransaction( "Hello",12,
                12, 12));

        System.out.println(accountSpy.getTransactions());

        System.out.println(accountSpy.makeTransaction( "Hello",12,
                12, 12));

    }

}
