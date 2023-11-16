package Bonus;

public class Engine {


    private double displacement;
    private int power;

    public Engine(double displacement, int power) {
        this.displacement = displacement;
        this.power = power;
    }

    public double getDisplacement() {
        return displacement;
    }

    public int getPower() {
        return power;
    }

    public String engineInfo(){
        return "De motor heeft een inhoud van " + displacement + " liter en een vermogen van " + power + " PK";
    }
}
