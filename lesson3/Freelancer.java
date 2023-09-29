/**
 * TODO: Реализовать тип фрилансера в рамках домашней работы
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public Freelancer(String surName, String name, int age, int hourlyRate, int hoursWorked) {
        super(surName, name, age, salary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;

    }


    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calculateSalary() {
        double monthlySalary = 20.8 * 8 * hourlyRate;
        return (int) Math.round(monthlySalary);
    }

    @Override
    public String toString() {
        return String.format("%s %s; %d лет; Фрилансер; Среднемесячная заработная плата (почасовая): %.2f (руб.)",
                surName, name, age, calculateSalary());
    }
}
