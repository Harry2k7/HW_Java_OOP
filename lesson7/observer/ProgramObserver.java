public class ProgramObserver {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     * добавить новый тип соискателя.
     * Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     * учитывать тип вакансии при отправке предложения соискателю.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();

        Company google = new Company("Google",jobAgency);
        Company yandex = new Company("Yandex", jobAgency);
        Company geekBrains = new Company("GeekBrains", jobAgency);

        Vacancy programmer = new Vacancy(VacancyType.Программист, 95000);
        Vacancy courier = new Vacancy(VacancyType.Курьер, 6000);
        Vacancy cleaner = new Vacancy(VacancyType.Уборщик, 11000);

        Student student1 = new Student("Студент №1", 15000);
        Master master1 = new Master("Мастер #1", VacancyType.Уборщик, 10000);
        Master master2 = new Master("Мастер #2", VacancyType.Программист, 100000);
        Senior senior1 = new Senior("Сеньор #1", VacancyType.Программист, 90000);

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(senior1);

        geekBrains.needEmployee(programmer);
        google.needEmployee(cleaner);
        yandex.needEmployee(courier);
    }
}
