package headFirst.factoryMethod.factoryMethod.franchise;

import headFirst.factoryMethod.factoryMethod.*;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")){
            pizza = new NYStyleCheesePizza(); //Concrete product that may extend Pizza abstract class.
        } else if (type.equalsIgnoreCase("greek")) {
            pizza = new GreekPizza(); //Concrete product
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new PepperoniPizza(); //Concrete product
        }
        return pizza;
    }
}
