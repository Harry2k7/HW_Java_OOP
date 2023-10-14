import java.util.Random;

public class Senior implements Observer {

    private static Random random = new Random();

    private String name;

    private VacancyType vacancyType;

    private int minSalary;

    public Senior(String name, VacancyType vacancyType, int minSalary) {
        this.name = name;
        this.vacancyType = vacancyType;
        minSalary = random.nextInt(80000, 100000);
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
