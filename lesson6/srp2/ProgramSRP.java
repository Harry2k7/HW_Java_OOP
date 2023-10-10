public class ProgramSRP {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     * принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Введите заказ:");
        Order order = new Order();

        ConsoleOrderInit orderInit = new ConsoleOrderInit();
        orderInit.inputFromConsole(order);

        OrderFileOtput orderFileFormat = new OrderFileOtput();
        orderFileFormat.saveToJson(order);

    }

}
