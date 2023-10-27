class Americano extends HotDrink {
    
    private int temperature;
    public Americano (String name, Double price){
        super(name, price);
        this.temperature = 65;
    }
    
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
