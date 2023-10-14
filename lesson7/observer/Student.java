public class Student implements Observer {

    private String name;

    private int minSalary = 2000;

    public Student(String name, int minSalary) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.minSalary <= vacancy.getMaxSalary()) {
            System.out.printf("%s: Мне нужна эта работа! (компания: %s - %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getVacancyName(), vacancy.getMaxSalary());
            this.minSalary = vacancy.getMaxSalary();
        } else {
            System.out.printf("%s: Я найду работу получше! (компания: %s - %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getVacancyName(), vacancy.getMaxSalary());
        }
    }
}
