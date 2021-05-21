package state;

public class DispenseState extends State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("Cannot Deduct Money");
    }

    @Override
    public boolean raffle() {
        System.out.println("Cannot Raffle");
        return false;
    }

    @Override
    public void dispensePrize() {
        if(activity.getCount() > 0){
            System.out.println("Yay, you win a prize");
            activity.setState(activity.getNoRaffleState());
        }else{
            System.out.println("Running out of prize :(");
            //activity.setState(activity.getDispenseOutState());
            System.out.println("");
            System.exit(0);
        }

    }
}
