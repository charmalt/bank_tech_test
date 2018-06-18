import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DepositTest {

    @Test
    public void depositHistoryIsInitialisedToEmptyArray(){

        Deposits deposits = new Deposits();

        assertEquals(deposits.history().isEmpty());

    }
}
