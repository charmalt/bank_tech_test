package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;


class TransactionHistoryTest {

    private ArrayList<Transaction> transactions;

    @Spy
    private TransactionHistory history = new TransactionHistory();

    @Mock
    private Transaction mockTransaction;

    @Mock
    private PrintStatement mockStatement;

    @BeforeEach
    void init(TestInfo testInfo) {
        MockitoAnnotations.initMocks(this);

        transactions = new ArrayList<>();
        transactions.add(mockTransaction);
        Mockito.doReturn(mockStatement).when(history).makePrintStatement(transactions);
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

    @Test
    void printTransactions(){
        history.addTransaction(mockTransaction);
        history.printStatement();
        verify(mockStatement, times(1)).print();
    }

}
