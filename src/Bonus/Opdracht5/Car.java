package Bonus.Opdracht5;

public class Car {

    private double displacement;
    private Integer topspeed;
    private String color;
    private String fuelType;
    private Integer fuel;
    private String brand;
    private WheelType wheelType;
    private Engine engine;

    public Car(String color, String fuelType, Integer fuel, String brand, WheelType wheelType, Engine engine) {
        displacement = engine.getDisplacement();
        topspeed = wheelType.topspeed();
        this.color = color;
        this.fuelType = fuelType;
        this.fuel = fuel;
        this.brand = brand;
        this.wheelType = wheelType;
        this.engine = engine;
    }

    public void printInfo(){
        System.out.println("Deze "+ brand +" auto heeft topsnelheid van " + topspeed + " en rijdt op " + fuelType);
        System.out.println(engine.engineInfo());
    }

    public Integer getFuelLevel() {
        return fuel;
    }

    public void refuel(int amount) {
        fuel += amount;
    }

    public String getFuelType() {
        return fuelType;
    }
}
