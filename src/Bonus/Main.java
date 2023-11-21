package Bonus;



import Bonus.Opdracht2.Store;
import Bonus.Opdracht3.Company;
import Bonus.Opdracht3.Manager;
import Bonus.Opdracht4.Chameleon;
import Bonus.Opdracht4.Giraffe;
import Bonus.Opdracht4.Lion;
import Bonus.Opdracht4.Zoo;
import Bonus.Opdracht5.Car;
import Bonus.Opdracht5.Engine;
import Bonus.Opdracht5.WheelType;
import Bonus.Opdracht1.Film;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------Opdracht1-----------");
        Film lotr = new Film("Lord of the Rings", "Peter Jackson", LocalDate.of(2001, 12, 10), "Avontuur");
        lotr.getInfo();


        System.out.println("----------Opdracht2-----------");
        Store store = new Store();
        store.addCandles(2);
        store.addSomething("cola", 3);
        store.printStock();

        System.out.println("----------Opdracht3-----------");
        Company company = new Company("Microsoft");
        Manager manager = new Manager("Bill Gates", 67);
        company.getInfo();
        company.hireManager(manager);
        company.getInfo();


        System.out.println("----------Opdracht4-----------");
        Lion lion = new Lion("Simba", "Leeuw", "vlees", "Leeuwenverblijf");
        Giraffe giraffe = new Giraffe("Flappie", "Giraffe", "bladeren", "Savanne verblijf");
        Chameleon chameleon = new Chameleon("Jelle", "Kameleon", "insecten", "Reptielenhuis");
        Zoo zoo = new Zoo(lion, chameleon, giraffe);
        zoo.showAnimals();


        System.out.println("----------Opdracht5-----------");
        WheelType wheelType = new WheelType("Michelin", 50, 2.7);
        Engine engine = new Engine(2.2, 500);
        Car car = new Car("blauw", "benzine", 500, "BMW", wheelType, engine);
        System.out.println("De car heeft nu " + car.getFeulLevel() + " liter " + car.getFeulType());
        car.refeul(200);
        System.out.println("Na het tanken heeft de car nu " + car.getFeulLevel() + " liter " + car.getFeulType());
        car.printInfo();


    }
}
