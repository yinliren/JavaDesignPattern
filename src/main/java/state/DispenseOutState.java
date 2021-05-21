package state;

public class DispenseOutState extends State {

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("Cannot Deduct Money (Out of Prize)");
    }

    @Override
    public boolean raffle() {
        System.out.println("Cannot Raffle (Out of Prize)");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("Cannot Dispense Prize (Out of Prize)");
    }
}
