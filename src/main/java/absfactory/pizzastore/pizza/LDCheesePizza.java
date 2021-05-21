package absfactory.pizzastore.pizza;

public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("London Cheese Pizza");
        System.out.println("Preparing London Cheese Pizza");
    }
}
