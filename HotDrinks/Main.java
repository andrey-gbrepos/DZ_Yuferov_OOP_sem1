// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем 
// int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и 
// реализовать перегруженный метод getProduct(int name, int volume, int temperature), 
// выдающий продукт соответствующий имени, объёму и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и 
// воспроизвести логику, заложенную в программе
// Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре


import java.util.Random;

public class Main {
        public static void main(String[] args) {
 
        Random rname = new Random(); 
            int indname = rname.nextInt(3);
        Random rvolume = new Random(); // Объем: 1- мал 2 - ср 3 - бол
            int volume = rvolume.nextInt(3)+1;
        Random rprice = new Random(); // Цена за 1
            double price = rprice.nextDouble(30);
        Random rcredit = new Random(); // Внесенные средства
            double cred = rcredit.nextDouble(100);
       
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();
       if (indname == 0) {
                Cappuccino cappuccino = new Cappuccino("Cappuccino", price);
                hotDrinkMachine.order(cappuccino.getName(), cappuccino.getPrice(), cred, volume);
                hotDrinkMachine.workingMachineToSell();
                hotDrinkMachine.getProduct(cappuccino.getName(), volume, cappuccino.getTemperature());
            }
        if (indname == 1) {
                Americano americano = new Americano("Americano", price);
                hotDrinkMachine.order(americano.getName(), americano.getPrice(), cred, volume);
                hotDrinkMachine.workingMachineToSell();
                hotDrinkMachine.getProduct(americano.getName(), volume, americano.getTemperature());
            } 
            if (indname == 2){
                HotChocolate hotChocolate = new HotChocolate("Hot Chocolate", price);
                hotDrinkMachine.order(hotChocolate.getName(), hotChocolate.getPrice(), cred, volume);
                hotDrinkMachine.workingMachineToSell();
                hotDrinkMachine.getProduct(hotChocolate.getName(), volume, hotChocolate.getTemperature());
       }         
    }
}