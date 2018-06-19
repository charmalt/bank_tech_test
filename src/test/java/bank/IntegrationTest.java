package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegrationTest {

    private Account account;
    private PrintStream originalSystemOut;
    private ByteArrayOutputStream systemOutContent;

    @BeforeEach
    void init(TestInfo testInfo) {
        TransactionHistory transactionHistory = new TransactionHistory();
        account = new Account(transactionHistory);

        System.out.println("Start..." + testInfo.getDisplayName());
    }

    @Test
    void makeDepositsAndWithdrawals(){

        account.deposit(1000, "12/12/2018");
        account.deposit(300, "12/12/2018");
        account.withdrawal(1000, "12/12/2018");
        account.print();

        assertEquals(account.getBalance(), 300 );
    }

    @Test
    void printStatement(){

        originalSystemOut = System.out;

        systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));

        account.deposit(1000, "10/01/2012");
        account.deposit(2000, "13/01/2012");
        account.withdrawal(500, "14/01/2012");
        account.print();

        String string = "date || credit || debit || balance\n14/01/2012 || || 500.00 || 2500.00\n13/01/2012 || 2000.00 || || 3000.00\n10/01/2012 || 1000.00 || || 1000.00\n";

        assertEquals(string, systemOutContent.toString());
    }
}
