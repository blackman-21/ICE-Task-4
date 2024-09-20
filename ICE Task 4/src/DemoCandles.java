import java.util.Scanner;

public class DemoCandles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Candle
        Candle candle = new Candle();
        System.out.print("Enter candle color: ");
        candle.setColor(input.nextLine());
        System.out.print("Enter candle height: ");
        candle.setHeight(input.nextInt());
        input.nextLine(); // Consume leftover newline

        // ScentedCandle
        ScentedCandle scentedCandle = new ScentedCandle();
        System.out.print("Enter scented candle color: ");
        scentedCandle.setColor(input.nextLine());
        System.out.print("Enter scented candle scent (e.g., Gardenia, Vanilla): ");
        scentedCandle.setScent(input.nextLine());
        System.out.print("Enter scented candle height: ");
        scentedCandle.setHeight(input.nextInt());

        // Display details
        System.out.println("\nCandle Details:");
        System.out.println("Color: " + candle.getColor());
        System.out.println("Height: " + candle.getHeight());
        System.out.println("Price: $" + candle.getPrice());

        System.out.println("\nScented Candle Details:");
        System.out.println("Color: " + scentedCandle.getColor());
        System.out.println("Scent: " + scentedCandle.getScent());
        System.out.println("Height: " + scentedCandle.getHeight());
        System.out.println("Price: $" + scentedCandle.getPrice());
    }
}
