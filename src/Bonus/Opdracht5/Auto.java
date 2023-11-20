package Bonus.Opdracht5;

public class Auto {

    private double displacement;
    private Integer topspeed;
    private String kleur;
    private String fuelType;
    private Integer fuel;
    private String brand;
    private Wheel wheelLF;
    private Wheel wheelRF;
    private Wheel wheelLB;
    private Wheel wheelRB;
    private Engine engine;

    public Auto(String kleur, String fuelType, Integer fuel, String brand, Wheel wheel, Engine engine) {
        displacement = engine.getDisplacement();
        topspeed = wheel.topspeed();
        this.kleur = kleur;
        this.fuelType = fuelType;
        this.fuel = fuel;
        this.brand = brand;
        wheelLF = wheel;
        wheelLB = wheel;
        wheelRB = wheel;
        wheelRF = wheel;
        this.engine = engine;
    }

    public void printInfo(){
        System.out.println("Deze "+ brand +" auto heeft topsnelheid van " + topspeed + " en rijdt op " + fuelType);
        System.out.println(engine.engineInfo());
    }

    public Integer getFuelLevel() {
        return fuel;
    }

    public void tanken(int amount) {
        fuel += amount;
    }

    public String getFuelType() {
        return fuelType;
    }
}
