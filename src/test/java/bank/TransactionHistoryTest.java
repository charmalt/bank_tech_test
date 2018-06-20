package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TransactionHistoryTest {

    private TransactionHistory history;

    @Mock
    private Transaction mockTransaction;

    @BeforeEach
    void init(TestInfo testInfo) {
        MockitoAnnotations.initMocks(this);
        history = new TransactionHistory();
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
