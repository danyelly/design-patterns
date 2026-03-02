package headFirst.factoryMethod.SimpleFactory;

public class PizzaStore {

    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    /* Factory Client.
    * PizzaStore needs to call createPizza method (SimplePizzaFactory)
    * to have pizza's instances
    **/
    public Pizza order(String type){
        Pizza pizza;

        // pizza = new CheesePizza();
        //concrete instantiation

        pizza = factory.createPizza(type); //creation method from factory object

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
