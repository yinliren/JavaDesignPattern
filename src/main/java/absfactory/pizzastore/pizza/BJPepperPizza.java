package absfactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza{

    @Override
    public void prepare() {
        setName("Beijing Pepper Pizza");
        System.out.println("Preparing Beijing Pepper Pizza");
    }
}
