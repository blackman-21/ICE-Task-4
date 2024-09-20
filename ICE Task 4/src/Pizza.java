// Pizza.java
public class Pizza {
    private String[] toppings;
    private double price;

    public Pizza(String[] toppings, int numToppings) {
        this.toppings = new String[numToppings];
        System.arraycopy(toppings, 0, this.toppings, 0, numToppings);
        this.price = 14 + 2 * numToppings;
    }

    public String getDescription() {
        return String.join(", ", toppings);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza with toppings: " + getDescription() + " | Price: $" + price;
    }
}
