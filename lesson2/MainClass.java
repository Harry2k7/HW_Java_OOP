import java.util.Scanner;

public class MainClass {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int additive;
        Cat[] Cats = {
                new Cat("Фирц", 35),
                new Cat("Фрея", 20),
                new Cat("Васька", 20),
                new Cat("Имбирь", 25) };

        Plate plate = new Plate(100);
        plate.info();

        for (Cat cat : Cats) {
            cat.eat(plate);
        }

        plate.info();
        System.out.println("Сколько ещё еды добавить в тарелку?");
        additive = scan.nextInt();
        plate.addFood(additive);
        plate.info();
        scan.close();

    }
}