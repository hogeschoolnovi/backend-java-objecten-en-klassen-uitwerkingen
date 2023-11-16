package Bonus;

public class Chameleon {
    private final String name;
    private final String species;
    private final String food;
    private final String shelter;

    public Chameleon(String name, String species, String food, String verblijf) {
        this.name = name;
        this.species = species;
        this.food = food;
        this.shelter = verblijf;
    }

    public String info(){
        return "Een "+ species + " genaamd " + name + " in het " + shelter + " en eet " + food;
    }
}
