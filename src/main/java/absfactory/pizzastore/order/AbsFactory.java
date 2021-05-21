package absfactory.pizzastore.order;

import absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
