// DemoCourse.java
import java.util.Scanner;

public class DemoCourse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter course name:");
        String courseName = input.nextLine();
        Course course = new Course(courseName);

        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");

            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter student name:");
                    String name = input.nextLine();
                    System.out.println("Enter roll number:");
                    int rollNumber = input.nextInt();
                    input.nextLine(); // Consume newline
                    Student student = new Student(name, rollNumber);
                    course.addStudent(student);
                    break;
                case 2:
                    course.displayStudents();
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
