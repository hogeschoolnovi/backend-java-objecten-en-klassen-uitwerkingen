package Bonus;



import Bonus.Opdracht2.Winkel;
import Bonus.Opdracht3.Bedrijf;
import Bonus.Opdracht3.Manager;
import Bonus.Opdracht4.Chameleon;
import Bonus.Opdracht4.Giraf;
import Bonus.Opdracht4.Lion;
import Bonus.Opdracht4.Zoo;
import Bonus.Opdracht5.Auto;
import Bonus.Opdracht5.Engine;
import Bonus.Opdracht5.Wheel;
import Bonus.Opdracht1.Film;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------Opdracht1-----------");
        Film lotr = new Film("Lord of the Rings", "Peter Jackson", LocalDate.of(2001, 12, 10), "Avontuur");
        lotr.getInfo();


        System.out.println("----------Opdracht2-----------");
        Winkel winkel = new Winkel();
        winkel.addCandles(2);
        winkel.addSomething("cola", 3);
        winkel.printStock();

        System.out.println("----------Opdracht3-----------");
        Bedrijf bedrijf = new Bedrijf("Microsoft");
        Manager manager = new Manager("Bill Gates", 67);
        bedrijf.getInfo();
        bedrijf.hireManager(manager);
        bedrijf.getInfo();


        System.out.println("----------Opdracht4-----------");
        Lion lion = new Lion("Simba", "Leeuw", "vlees", "Leeuwenverblijf");
        Giraf giraf = new Giraf("Flappie", "Giraf", "bladeren", "Savanne verblijf");
        Chameleon chameleon = new Chameleon("Jelle", "Kameleon", "insecten", "Reptielenhuis");
        Zoo zoo = new Zoo(lion, chameleon, giraf);
        zoo.showAnimals();


        System.out.println("----------Opdracht5-----------");
        Wheel wheel = new Wheel("Michelin", 50, 2.7);
        Engine engine = new Engine(2.2, 500);
        Auto auto = new Auto("blauw", "benzine", 500, "BMW", wheel, engine);
        System.out.println("De auto heeft nu " + auto.getFeulLevel() + " liter " + auto.getFeulType());
        auto.tanken(200);
        System.out.println("Na het tanken heeft de auto nu " + auto.getFeulLevel() + " liter " + auto.getFeulType());
        auto.printInfo();


    }
}
