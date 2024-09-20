import java.util.Scanner;

public class DemoHorses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Horse object
        Horse horse = new Horse();
        System.out.print("Enter horse's name: ");
        horse.setName(input.nextLine());
        System.out.print("Enter horse's color: ");
        horse.setColor(input.nextLine());
        System.out.print("Enter horse's birth year: ");
        horse.setBirthYear(input.nextInt());

        // RaceHorse object
        RaceHorse raceHorse = new RaceHorse();
        input.nextLine(); // Consume leftover newline
        System.out.print("Enter racehorse's name: ");
        raceHorse.setName(input.nextLine());
        System.out.print("Enter racehorse's color: ");
        raceHorse.setColor(input.nextLine());
        System.out.print("Enter racehorse's birth year: ");
        raceHorse.setBirthYear(input.nextInt());
        System.out.print("Enter number of races competed: ");
        raceHorse.setRacesCompeted(input.nextInt());

        // Display details
        System.out.println("\nHorse Details:");
        System.out.println("Name: " + horse.getName());
        System.out.println("Color: " + horse.getColor());
        System.out.println("Birth Year: " + horse.getBirthYear());

        System.out.println("\nRaceHorse Details:");
        System.out.println("Name: " + raceHorse.getName());
        System.out.println("Color: " + raceHorse.getColor());
        System.out.println("Birth Year: " + raceHorse.getBirthYear());
        System.out.println("Races Competed: " + raceHorse.getRacesCompeted());
    }
}
