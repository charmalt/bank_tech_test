import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;


import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

public class DepositsTest {

    @Test
    public void depositHistoryIsInitialisedToEmptyArray(){

        Deposits deposits = new Deposits();

        assertThat(deposits.getHistory(), IsEmptyCollection.empty());

    }

    @Test
    public void addNewDeposit(){

        Deposits deposits = new Deposits();
        deposits.addDeposit(100);
        deposits.addDeposit(200);
        assertThat(deposits.getHistory(), contains(100, 200));

    }

}
