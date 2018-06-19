package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TransactionHistoryTest {

    private TransactionHistory history;

    @BeforeEach
    void setUp() {
        history = new TransactionHistory();
    }

    @Test
    void EmptyListOnInitialize() {
        assertEquals(new ArrayList<Transaction>(), history.getTransactions());
    }

}
