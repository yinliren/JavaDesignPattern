package state;


import java.util.Random;

public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("Money already got deducted~~~");
    }

    @Override
    public boolean raffle() {
        System.out.println("Raffling, please wait.........");
        Random r = new Random();
        int num = r.nextInt(10);
        if(num == 0){
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("You did not win :(");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("Cannot dispense before the raffle.");
    }
}
