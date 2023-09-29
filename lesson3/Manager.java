public class Manager extends Employee {
    public Manager(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s; %d лет; Менеджер; Среднемесячная заработная плата (фиксированная): %.2f (руб.)",
                surName, name, age, calculateSalary());
    }  
}
