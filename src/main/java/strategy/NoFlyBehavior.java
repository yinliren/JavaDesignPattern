package strategy;

public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't fly :(");
    }

}
