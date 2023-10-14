public class Vacancy {

    private VacancyType vacancyName;
    private int maxSalary;

    public Vacancy(VacancyType vacancyName, int maxSalary) {
        this.vacancyName = vacancyName;
        this.maxSalary = maxSalary;
    }

    public VacancyType getVacancyName() {
        return vacancyName;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

}
