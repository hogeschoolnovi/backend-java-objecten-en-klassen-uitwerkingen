package Bonus.Opdracht5;

public class WheelType {

    private String brand;
    private Integer diameter;
    private double profile;

    public WheelType(String brand, Integer diameter, double profile) {
        this.brand = brand;
        this.diameter = diameter;
        this.profile = profile;
    }

    public int topspeed(){
        return 200;
    }
}
