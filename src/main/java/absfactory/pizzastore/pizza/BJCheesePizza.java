package absfactory.pizzastore.pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("Beijing Cheese Pizza");
        System.out.println("Preparing Beijing Cheese Pizza");
    }
}
