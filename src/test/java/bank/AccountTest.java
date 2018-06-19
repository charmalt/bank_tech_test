package bank;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;


@RunWith(MockitoJUnitRunner.class)
class AccountTest {

    @Spy
    private Account account;

    @Mock
    TransactionHistory transactionHistory = new TransactionHistory();

    @Mock
    private Transaction mockTransaction = Mockito.mock(Transaction.class);

    @BeforeEach
    void init(TestInfo testInfo) {
        account = Mockito.spy(new Account(transactionHistory));

        Mockito.doReturn(mockTransaction).when(account).makeTransaction( anyString(), anyInt(),
                anyInt(), anyInt());

        System.out.println("Start..." + testInfo.getDisplayName());
    }


    @Test
    void newAccountHasDefaultZeroBalance(){

        assertEquals(account.getBalance(), 0);
    }

    @Test
    void transactionHistoryInitializedToEmpty(){

        assertThat(account.transactions.transactions, IsEmptyCollection.empty());
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

    @Test
    void makeNewTransaction(){

        assertEquals(mockTransaction, account.makeTransaction( "Hello",12,
                12, 12));

    }

    @Test
    void saveNewTransaction(){

        assertEquals(account.transactions, transactionHistory);

    }

}
