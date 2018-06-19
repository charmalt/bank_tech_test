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
        account.deposit(1000, "12/12/2018");

        System.out.println("Start..." + testInfo.getDisplayName());
    }

    @Test
    void makeDepositsAndWithdrawals(){

        account.deposit(300, "12/12/2018");
        account.withdrawal(1000, "12/12/2018");

        assertEquals(account.getBalance(), 300 );
    }

    @Test
    void printStatement(){

        originalSystemOut = System.out;

        systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));

        account.deposit(300, "12/12/2018");
        account.withdrawal(1000, "12/12/2018");
        account.print();

        String string = "      Date Withdrawal    Deposit    Balance\n12/12/2018          0       1000       1000\n12/12/2018          0        300       1300\n12/12/2018       1000          0        300\n";

        assertEquals(string, systemOutContent.toString());
    }
}
