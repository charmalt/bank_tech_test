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

    @Mock
    TransactionHistory transactionHistory = new TransactionHistory();

    @Spy
    private Account account = new Account(transactionHistory);

    @Mock
    private Transaction mockTransaction;

    @BeforeEach
    void init(TestInfo testInfo) {
        MockitoAnnotations.initMocks(this);

        Mockito.doReturn(mockTransaction).when(account).makeTransaction( anyString(), anyInt(),
                anyInt(), anyInt());

        System.out.println("Start..." + testInfo.getDisplayName());
    }


    @Test
    void newAccountHasDefaultZeroBalance(){

        assertEquals(account.getBalance(), 0);
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


}
