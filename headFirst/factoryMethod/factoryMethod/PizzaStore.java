package headFirst.factoryMethod.factoryMethod;

public abstract class PizzaStore {

    //client-code: interacts with another class, object or module.
    public Pizza order(String type){
        Pizza pizza;

        // pizza = new CheesePizza();
        //concrete instantiation

        pizza = createPizza(type); //call an abstract method

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //(parameterized) factory method
     public abstract Pizza createPizza(String type);


    //here now has the factory method, responsible to instantiate Pizza in subclasses
    // the subclasses MUST to handling with the creation of the objects (concrete Product)
}


/*
* A parameterized Factory Method allows the creation method to accept an argument that decides which concrete
* implementation to instantiate, increasing flexibility while preserving loose coupling between the client and
* the concrete classes.
* */