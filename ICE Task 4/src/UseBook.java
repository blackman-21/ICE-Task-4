// UseBook.java
import java.util.Scanner;

public class UseBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the title of the fiction book:");
        String fictionTitle = scanner.nextLine();
        Book fictionBook = new Fiction(fictionTitle);
        System.out.println("Fiction Book: " + fictionBook.getTitle() + " - Price: $" + fictionBook.getPrice());

        System.out.println("Enter the title of the non-fiction book:");
        String nonFictionTitle = scanner.nextLine();
        Book nonFictionBook = new NonFiction(nonFictionTitle);
        System.out.println("Non-Fiction Book: " + nonFictionBook.getTitle() + " - Price: $" + nonFictionBook.getPrice());
    }
}
