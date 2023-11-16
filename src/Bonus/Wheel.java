package Bonus;

public class Wheel {

    private String brand;
    private Integer diameter;
    private double profile;

    public Wheel(String brand, Integer diameter, double profile) {
        this.brand = brand;
        this.diameter = diameter;
        this.profile = profile;
    }

    public int topspeed(){
        return 200;
    }
}
