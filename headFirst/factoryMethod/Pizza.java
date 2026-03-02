package headFirst.factoryMethod;

//this is the final product of the fabric: the PIZZA.
public abstract class Pizza {
    private String description;
    private float price;

    public void box() {
        System.out.println("Packing");
    }

    public void cut() {
        System.out.println("Cutting");
    }

    public void bake() {
        System.out.println("Baking");
    }

    public void prepare() {
        System.out.println("Preparing");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
