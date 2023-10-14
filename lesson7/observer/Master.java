public class Master implements Observer {

    private String name;

    private VacancyType vacancyType;

    private int minSalary = 10000;

    public Master(String name, VacancyType vacancyType, int minSalary) {
        this.name = name;
        this.vacancyType = vacancyType;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (vacancyType.equals(vacancy.getVacancyName()))
            if (this.minSalary <= vacancy.getMaxSalary()) {
                System.out.printf("%s: Мне нужна эта работа! (компания: %s - %s; заработная плата: %d)\n",
                        name, nameCompany, vacancy.getVacancyName(), vacancy.getMaxSalary());
                this.minSalary = vacancy.getMaxSalary();
            } else {
                System.out.printf("%s: Я найду работу получше! (компания: %s - %s; заработная плата: %d)\n",
                        name, vacancy.getVacancyName(), nameCompany, vacancy.getMaxSalary());
            }
    }

}
