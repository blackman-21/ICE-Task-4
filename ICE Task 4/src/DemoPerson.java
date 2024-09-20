// DemoPerson.java
import java.util.Scanner;

public class DemoPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = input.nextLine();
        System.out.println("Enter last name:");
        String lastName = input.nextLine();
        System.out.println("Enter street:");
        String street = input.nextLine();
        System.out.println("Enter city:");
        String city = input.nextLine();
        System.out.println("Enter state:");
        String state = input.nextLine();
        System.out.println("Enter zip code:");
        String zipCode = input.nextLine();

        Address address = new Address(street, city, state, zipCode);
        Person person = new Person(firstName, lastName, address);

        System.out.println("Person Details:");
        System.out.println(person);
    }
}
