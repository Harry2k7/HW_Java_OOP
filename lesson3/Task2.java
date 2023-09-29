import java.util.Arrays;
import java.util.Random;

public class Task2 {

    private static Random random = new Random();

    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int age = random.nextInt(25, 55);
        int salary = random.nextInt(50000, 120000);
        int employeeType = random.nextInt(3); // генерируем случайное число для определения типа сотрудника

        Employee employee;

        switch (employeeType) {
            case 0:
                employee = new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], age, salary);
                break;
            case 1:
                int hoursWorked = random.nextInt(120, 200);
                int hourlyRate = random.nextInt(500, 1000);
                employee = new Freelancer(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], age,
                        hourlyRate, hoursWorked);
                break;
            default:
                employee = new Manager(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], age, salary);
                break;
        }

        return employee;
    }

    private static Employee[] generateEmployees(int count) {
        Employee[] array = new Employee[count];
        for (int i = 0; i < array.length; i++)
            array[i] = generateEmployee();
        return array;
    }



    public static void main(String[] args) {

        // Employee[] employees = generateEmployees(15);

        // Arrays.sort(employees, new SalaryComparator(SortType.Ascending));

        // for (Employee employee: employees) {
        //     System.out.println(employee);
        // }

        // System.out.println();

        // Arrays.sort(employees, new SalaryComparator(SortType.Descending));

        // for (Employee employee : employees) {
        //     System.out.println(employee);
        // }
        
        Employee[] employees = generateEmployees(10);

        Arrays.sort(employees, new AgeComparator(SortType.Ascending));

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new AgeComparator(SortType.Descending));

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }












}
