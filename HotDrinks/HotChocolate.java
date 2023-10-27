class HotChocolate extends HotDrink {
    
    private int temperature;
    public HotChocolate (String name, Double price){
        super(name, price);
        this.temperature = 50;
    }
    
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
