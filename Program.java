import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product bottleOfMilk1 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (1)", 150, 2, 15);
     //   System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("ООО Источник", "Бутылка с водой (5)", 150, 2, 15);
     //   System.out.println(bottleOfWater1.displayInfo());


        Product bottleOfMilk2 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (2)", 110, 1, 15);
        Product bottleOfMilk3 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (3)", 160, 2, 25);
        Product bottleOfMilk4 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (4)", 170, 3, 35);
        Product chocolate1 = new Chocolate("ОАО КК Бабаевский", "Вдохновение", 200, 570);


        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(bottleOfMilk1);
        arrayList.add(bottleOfWater1);
        arrayList.add(bottleOfMilk2);
        arrayList.add(bottleOfMilk3);
        arrayList.add(bottleOfMilk4);
        arrayList.add(chocolate1);

        VendingMachine vendingMachine = new VendingMachine(arrayList);

        // BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Бутылка с молоком (3)", 2);
        // if (bottleOfMilk != null){
        //     System.out.println("Вы купили:");
        //     System.out.println(bottleOfMilk.displayInfo());
        // }
        // else {
        //     System.out.println("Такой бутылки с молоком нет в автомате.");
        // }

        Chocolate chocolate = vendingMachine.getChocolate("Вдохновение", 200);
        if (chocolate != null) {
            System.out.println("Вы купили:");
            System.out.println(chocolate.displayInfo());
        } else {
            System.out.println("Такой шоколадки нет в автомате.");
        }

    }

}
