package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class PrintStatementTest {

    private PrintStatement printStatement;
    private ArrayList<Transaction> transactions =  new ArrayList<>();
    private PrintStream originalSystemOut;
    private ByteArrayOutputStream systemOutContent;

    @Mock
    private Transaction transaction = new Transaction("12/12/14", 0, 1000, 1000);

    @BeforeEach
    void init(TestInfo testInfo) {
        MockitoAnnotations.initMocks(this);
        transactions.add(transaction);

        printStatement = new PrintStatement(transactions);
        when(transaction.getDate()).thenReturn("12/12/14");
        when(transaction.getWithdrawal()).thenReturn((double) 0);
        when(transaction.getDeposit()).thenReturn((double) 1000);
        when(transaction.getBalance()).thenReturn((double) 1000);

        originalSystemOut = System.out;
        systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));

        System.out.println("Start..." + testInfo.getDisplayName());

    }

    @Test
    void printsTitle(){
        printStatement.print();
        String string = "date || credit || debit || balance\n  12/12/14 || 1000.00 || || 1000.00";
        assertTrue(systemOutContent.toString().contains(string));
    }
}
