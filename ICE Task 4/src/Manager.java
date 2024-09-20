// Manager.java
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus: $" + bonus;
    }
}
