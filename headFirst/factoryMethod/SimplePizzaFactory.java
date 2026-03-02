package headFirst.factoryMethod;

/* This is the factory where pizzas are created.
* It may be the only part on our codebase that refers to concrete pizza classes.
**/
public class SimplePizzaFactory {
    // Creation method usually declared as static.
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza(); //Concrete product that may extend Pizza abstract class.
        } else if (type.equalsIgnoreCase("greek")) {
            pizza = new GreekPizza(); //Concrete product
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new PepperoniPizza(); //Concrete product
        }

        return pizza;
    }

}
