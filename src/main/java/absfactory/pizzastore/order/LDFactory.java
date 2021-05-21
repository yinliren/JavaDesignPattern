package absfactory.pizzastore.order;

import absfactory.pizzastore.pizza.LDCheesePizza;
import absfactory.pizzastore.pizza.LDPepperPizza;
import absfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("Creating Pizza");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
