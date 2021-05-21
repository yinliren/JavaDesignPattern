package absfactory.pizzastore.order;

import absfactory.pizzastore.pizza.BJCheesePizza;
import absfactory.pizzastore.pizza.BJPepperPizza;
import absfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("Creating Pizza");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
