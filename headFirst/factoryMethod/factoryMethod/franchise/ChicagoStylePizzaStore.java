package headFirst.factoryMethod.factoryMethod.franchise;

import headFirst.factoryMethod.factoryMethod.*;
/* Every subclass of PizzaStore MUST implement the abstract method createPizza
* */
public class ChicagoStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")){
            pizza = new CHStyleCheesePizza(); //Concrete product that must extend Pizza abstract class.
        } else if (type.equalsIgnoreCase("greek")) {
            pizza = new GreekPizza(); //Concrete product
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new PepperoniPizza(); //Concrete product
        }
        return pizza;
    }

}
