package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TransactionHistoryTest {

    private TransactionHistory history;

    @Mock
    private Transaction mockTransaction;

    @BeforeEach
    void init(TestInfo testInfo) {
        history = new TransactionHistory();
        mockTransaction = Mockito.mock(Transaction.class);
        System.out.println("Start..." + testInfo.getDisplayName());
    }

    @Test
    void EmptyListOnInitialize() {
        assertEquals(new ArrayList<Transaction>(), history.transactions);
    }

    @Test
    void addNewTransaction(){
        history.addTransaction(mockTransaction);
        assertEquals(mockTransaction, history.transactions.get(0));
    }

}
