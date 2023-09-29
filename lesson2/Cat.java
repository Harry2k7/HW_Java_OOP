public class Cat {
    public String name;
    public int appetite;
    public boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite && !satiety) {
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println("котик " + name + " поел!");
        } else {
            System.out.println("котик " + name + " остался голодным!");
        }
    }

    public boolean isWellFed() {
        return satiety;
    }

}