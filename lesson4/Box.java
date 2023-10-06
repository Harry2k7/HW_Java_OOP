import java.util.ArrayList;

public class Box<T extends Fruct> {

    private ArrayList<T> fruits = new ArrayList<>();

    // Метод для добавления фрукта в коробку
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    // Метод для вычисления веса коробки
    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            if (fruit instanceof Apple) {
                weight += 1.0f;
            } else if (fruit instanceof Orange) {
                weight += 1.5f;
            }
        }
        return weight;
    }

    // Метод для сравнения веса коробок
    public boolean compare(Box<? extends Fruct> otherBox) {
        if (this.getWeight() == otherBox.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    // Метод пересыпания из коробоки в коробку
    public void transferTo(Box<T> otherBox) {
        if (this == otherBox) {
            return;
        }

        for (T fruit : fruits) {
            otherBox.addFruit(fruit);
        }
        fruits.clear(); // коробка пустая
    }
}
