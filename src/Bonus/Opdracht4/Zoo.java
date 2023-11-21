package Bonus.Opdracht4;

public class Zoo {

    private final Lion lion;
    private final Chameleon chameleon;
    private final Giraffe giraf;

    public Zoo(Lion lion, Chameleon chameleon, Giraffe giraf) {
        this.lion = lion;
        this.chameleon = chameleon;
        this.giraf = giraf;
    }

    public void showAnimals(){
        System.out.println("Deze dierentuin bevat: ");
        System.out.println("- " + giraf.info());
        System.out.println("- " + lion.info());
        System.out.println("- " + chameleon.info());
    }
}
