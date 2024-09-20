// DemoEmployee.java
import java.util.Scanner;

public class DemoEmployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee name:");
        String name = input.nextLine();
        System.out.println("Enter employee ID:");
        int id = input.nextInt();
        System.out.println("Enter monthly salary:");
        double salary = input.nextDouble();

        System.out.println("Is this employee a manager? (yes/no)");
        input.nextLine(); // Consume newline
        String managerResponse = input.nextLine();

        Employee employee;
        if (managerResponse.equalsIgnoreCase("yes")) {
            System.out.println("Enter bonus amount:");
            double bonus = input.nextDouble();
            employee = new Manager(name, id, salary, bonus);
        } else {
            employee = new Employee(name, id, salary);
        }

        System.out.println(employee);
        System.out.println("Annual Salary: $" + employee.getAnnualSalary());
    }
}
