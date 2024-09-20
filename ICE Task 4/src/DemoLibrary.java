// DemoLibrary.java
import java.util.Scanner;

public class DemoLibrary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();

        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Exit");

            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter book title:");
                    String title = input.nextLine();
                    System.out.println("Enter book author:");
                    String author = input.nextLine();
                    System.out.println("Enter book price:");
                    double price = input.nextDouble();
                    input.nextLine(); // Consume newline
                    Book book = new Book(title, author, price);
                    library.addBook(book);
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
