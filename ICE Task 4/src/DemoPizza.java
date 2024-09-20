// DemoPizza.java
import java.util.Scanner;

public class DemoPizza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] toppings = new String[10];
        int numToppings = 0;
        String topping;

        System.out.println("Enter pizza toppings (type 'QUIT' to finish):");
        while (numToppings < 10) {
            topping = input.nextLine();
            if (topping.equalsIgnoreCase("QUIT")) {
                break;
            }
            toppings[numToppings++] = topping;
        }

        System.out.println("Is the pizza for delivery? (yes/no)");
        String deliveryResponse = input.nextLine();
        Pizza pizza;

        if (deliveryResponse.equalsIgnoreCase("yes")) {
            System.out.println("Enter delivery address:");
            String address = input.nextLine();
            pizza = new DeliveryPizza(toppings, numToppings, address);
        } else {
            pizza = new Pizza(toppings, numToppings);
        }

        System.out.println(pizza);
    }
}
