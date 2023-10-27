class Cappuccino extends HotDrink {
    
    private int temperature;
    public Cappuccino (String name, Double price){
        super(name, price);
        this.temperature = 60;
    }
    
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
