package headFirst.factoryMethod.factoryMethod;

import headFirst.factoryMethod.factoryMethod.franchise.ChicagoStylePizzaStore;

public class Main {
    public static void main(String[] args) {
        // Here I'm deciding which type of Pizza Style I want
        PizzaStore chPizza = new ChicagoStylePizzaStore();
        chPizza.order("Cheese");

        /*
         * The order() method is defined in the abstract PizzaStore class.
         * It does not know which concrete subclass is executing it
         * or which specific pizza implementation is being created.
         */
    }
}
