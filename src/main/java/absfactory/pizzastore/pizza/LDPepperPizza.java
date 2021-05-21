package absfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("London Pepper pizza");
        System.out.println("Preparing London Pepper Pizza");
    }
}
