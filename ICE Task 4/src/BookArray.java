// BookArray.java
import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter the title of the book:");
            String title = scanner.nextLine();

            System.out.println("Is this book Fiction (F) or Non-Fiction (N)?");
            char bookType = scanner.nextLine().charAt(0);

            if (bookType == 'F' || bookType == 'f') {
                books[i] = new Fiction(title);
            } else if (bookType == 'N' || bookType == 'n') {
                books[i] = new NonFiction(title);
            } else {
                System.out.println("Invalid type. Please enter F for Fiction or N for Non-Fiction.");
                i--; // To reprompt
            }
        }

        // Display all book details
        System.out.println("\nDetails of all books:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " - Price: $" + book.getPrice());
        }
    }
}
