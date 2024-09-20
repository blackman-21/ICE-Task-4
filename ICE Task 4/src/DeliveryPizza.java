// DeliveryPizza.java
public class DeliveryPizza extends Pizza {
    private double deliveryFee;
    private String deliveryAddress;

    public DeliveryPizza(String[] toppings, int numToppings, String address) {
        super(toppings, numToppings);
        this.deliveryAddress = address;
        if (getPrice() > 18) {
            this.deliveryFee = 3;
        } else {
            this.deliveryFee = 5;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Delivery Address: " + deliveryAddress + " | Delivery Fee: $" + deliveryFee;
    }
}
