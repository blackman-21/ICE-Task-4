// Employee.java
public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    @Override
    public String toString() {
        return "Employee Name: " + name + ", ID: " + id + ", Monthly Salary: $" + salary;
    }
}
