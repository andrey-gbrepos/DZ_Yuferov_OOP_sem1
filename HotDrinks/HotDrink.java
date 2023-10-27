/**
 // Родительский класс  HotDrink для горячих напитков
 */
public class HotDrink {
        private String name;
        private Double price;
       
    public HotDrink(String name, Double price){
        this.name = name;
        this.price = price;      
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}