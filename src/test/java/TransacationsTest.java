import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;


import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

public class TranscationsTest {

    @Test
    public void depositHistoryIsInitialisedToEmptyArray(){

        Transacations transacations = new Transacations();

        assertThat(transacations.getHistory(), IsEmptyCollection.empty());

    }

    @Test
    public void addNewDeposit(){

        Transacations transacations = new Transacations();
        transacations.addDeposit(100);
        transacations.addDeposit(200);
        assertThat(transacations.getHistory(), contains(100, 200));

    }

}
