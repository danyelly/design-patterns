package headFirst.factoryMethod.factoryMethod;

import java.util.ArrayList;

//this is the final product of the fabric: the PIZZA.
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void prepare() {
        System.out.println("🍕 Preparing " + name);
        System.out.println("🤲 Tossing dough...");
        System.out.println("🥫 Adding sauce...");
        System.out.println("🧀🍄🥓 Adding delicious toppings:");
        for(int i = 0; i < toppings.size(); i++){
            System.out.println(" " + toppings.get(i));
        }
    }

    public String getName() {
        return name;
    }
}
