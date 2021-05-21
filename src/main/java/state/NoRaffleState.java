package state;

public class NoRaffleState extends State {

    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("Successfully deducted the money -50");
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("Cannot participate the raffle before deduct the money~~");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("Cannot dispense prize now.");
    }
}
