
public class Chocolate extends Product{
    int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Chocolate(String brand, String name, double price, int calories) {
        super(brand, name, price);
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("[ШОКОЛАД] %s - %s - %.2f руб. - КкалориЙ: %d",
                brand, name, price, calories);
    }
}
