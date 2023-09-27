public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void addFood(int amount) {
        food += amount;
    }

    public int getFood() {
        return food;
    }
    
    public void info() {
        System.out.println("Еды в тарелке: " + food);
    }
}
