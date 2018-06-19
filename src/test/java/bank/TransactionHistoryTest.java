package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TransactionHistoryTest {

    private TransactionHistoryTest history;

    @BeforeEach
    void setUp() {
       history = new TransactionHistoryTest();
    }

    @Test
    void hasNoTransactionsInitially() {
        assertEquals(new ArrayList<Transaction>(), history.getTransactions());
    }

}
