package state;

public class ClientTest {

    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(2);
        for (int i = 0; i < 30; i++) {
            System.out.println("Round " + (i + 1) + " raffle");
            activity.deductMoney();
            activity.raffle();
        }
    }

}
