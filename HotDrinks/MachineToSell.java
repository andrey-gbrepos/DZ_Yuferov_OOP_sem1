 public class MachineToSell {

    private String name; 
    private Double price; 
    private Double credit; 
  
    public MachineToSell(String name, Double price, Double credit){
            this.name = name;
            this.price = price;
            this.credit = credit;
           
    }
    public MachineToSell() {

    }
    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    public Double getCredit() {
        return credit;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setCredit(Double credit) {
        this.credit = credit;
    }
   
    public void order(String name, Double price,Double credit,int volume){
        System.out.println("Заказ: ");
        System.out.println("Напиток " + name);
        System.out.println("Количество " + volume +"-ная порция");
        System.out.println("Кредит: " + credit);
    }
    
    void workingMachineToSell(){
        System.out.println("Работа автомата продажи: ");
    }
    void getProduct(String name, int volume){    
            System.out.println(name + " готов" + volume + "-ная порция");
    }
}
