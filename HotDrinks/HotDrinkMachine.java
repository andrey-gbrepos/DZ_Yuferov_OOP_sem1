class HotDrinkMachine extends MachineToSell {
         int temperature;
         int volume;
    public HotDrinkMachine(String name, Double price, Double credit, int temperature, int volume) {
        super(name, price, credit);
        this.temperature = temperature;
        this.volume = volume;
    }
    public HotDrinkMachine(){

    }
        private Double crd;
        private Double prc;
    public void order(String name, Double price,Double credit,int volume){
        crd = credit;
        prc = price;
        System.out.println("Заказ: ");
        System.out.println("Напиток " + name);
        System.out.println("Объем " + (volume)+ "-ная порция");
        System.out.print("Цена за 1 - ");
        System.out.printf("%.2f ", price); 
        System.out.print("Кредит: ");
        System.out.printf("%.2f ", credit);
        System.out.println();
        System.out.println();
    }    
    public boolean enaughMany(Double credit, Double price, Integer volume){
        if(credit >= (price*volume)){ 
                    return true;
            } else {
                    return false;
        }
   }

   @Override
    void workingMachineToSell(){
    System.out.println("Работа автомата горячих напитков: ");
    System.out.println();
    }

    public void getProduct(String name, int volume, int temperature) {
        if(enaughMany(crd, prc, volume)){
            System.out.print("Ваша сдача: ");
            System.out.printf("%.2f", crd-(prc*volume));
            System.out.println();
            System.out.println("Ваш "+ name + " готов. Температура напитка " + temperature + " градусов");
            System.out.println();
            } else {
            System.out.println("Недостаточно средств");
            System.out.println();      
        }   
    }
}

