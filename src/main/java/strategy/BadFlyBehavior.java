package strategy;

public class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flapping wings.....  not flying high though......");
    }

}
