import java.util.ArrayList;

public class Deposits {

    private ArrayList<Integer> history = new ArrayList<Integer>();

    public ArrayList<Integer> getHistory() {
        return history;
    }

    public void addDeposit(int newDeposit){
        getHistory().add(newDeposit);
    }

}
