package Bonus.Opdracht4;

import Bonus.Opdracht4.Chameleon;
import Bonus.Opdracht4.Giraf;
import Bonus.Opdracht4.Lion;

public class Zoo {

    private final Lion lion;
    private final Chameleon chameleon;
    private final Giraf giraf;

    public Zoo(Lion lion, Chameleon chameleon, Giraf giraf) {
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
