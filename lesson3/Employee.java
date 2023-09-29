/**
 * Работник (базовый класс)
 */
public abstract class Employee implements Comparable<Employee> {

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    protected int age;

    /**
     * Ставка заработной платы
     */
    protected static double salary;

    /**
     * Расчет среднемесячной заработной платы сотрудника
     * @return
     */
    public abstract double calculateSalary();

    public Employee(String surName, String name, int age, double salary) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        Employee.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {

        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }
}
