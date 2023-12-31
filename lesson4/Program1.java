public class Program1 {

    /*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.
    
    Формат сдачи: ссылка на гитхаб проект
        * */
    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        Box<Apple> appleBox3 = new Box<>();
        appleBox3.addFruit(new Apple());
        appleBox3.addFruit(new Apple());
        appleBox3.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес appleBox2: " + appleBox2.getWeight());
        System.out.println("Вес appleBox3: " + appleBox3.getWeight());
        System.out.println("Вес orangeBox: " + orangeBox.getWeight());
        System.out.println("------------------------------------");
        System.out.println("Сравнение appleBox1 и appleBox2: " + appleBox1.compare(appleBox2));
        System.out.println("Сравнение appleBox1 и orangeBox: " + appleBox1.compare(orangeBox));
        System.out.println("Сравнение appleBox1 и appleBox3: " + appleBox1.compare(appleBox3));
        System.out.println("------------------------------------");
        appleBox1.transferTo(appleBox2);
        System.out.println("Вес appleBox1 после пересыпания: " + appleBox1.getWeight());
        System.out.println("Вес appleBox2 после пересыпания: " + appleBox2.getWeight());
        System.out.println("------------------------------------");

        //appleBox1.transferTo(orangeBox);  //Попытка смешать яблоки и апельсины выдаёт ошибку компиляции
    }
}