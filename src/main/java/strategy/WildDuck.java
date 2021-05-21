package strategy;

public class WildDuck extends Duck {

    public  WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("I am a wild duck");
    }

}
