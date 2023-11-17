package Bonus.Opdracht5;

public class Auto {

    private double displacement;
    private Integer topspeed;
    private String kleur;
    private String feulType;
    private Integer feul;
    private String brand;
    private Wheel wheelLF;
    private Wheel wheelRF;
    private Wheel wheelLB;
    private Wheel wheelRB;
    private Engine engine;

    public Auto(String kleur, String feulType, Integer feul, String brand, Wheel wheel, Engine engine) {
        displacement = engine.getDisplacement();
        topspeed = wheel.topspeed();
        this.kleur = kleur;
        this.feulType = feulType;
        this.feul = feul;
        this.brand = brand;
        wheelLF = wheel;
        wheelLB = wheel;
        wheelRB = wheel;
        wheelRF = wheel;
        this.engine = engine;
    }

    public void printInfo(){
        System.out.println("Deze "+ brand +" auto heeft topsnelheid van " + topspeed + " en rijdt op " + feulType);
        System.out.println(engine.engineInfo());
    }

    public Integer getFeulLevel() {
        return feul;
    }

    public void tanken(int amount) {
        feul += amount;
    }

    public String getFeulType() {
        return feulType;
    }
}
