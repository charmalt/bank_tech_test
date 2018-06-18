package bank;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void setAccountBalance(){

        account.setBalance(100);

        assertEquals(account.getBalance(), 100);
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
        account.withdrawal(100);

        assertEquals(account.getBalance(), 0);
    }

    @Test
    void saveNewTransaction(){

        account.deposit(100, "12/01/2018");

    }

}
