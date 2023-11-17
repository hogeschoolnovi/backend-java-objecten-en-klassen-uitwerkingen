package Bonus.Opdracht3;

import Bonus.Opdracht3.Manager;

public class Bedrijf {
    //## Opdracht 3: Bedrijf
//        Maak een _Bedrijf_ klasse met attributen voor bedrijfsnaam en de manager.
//
//                Maak een _Manager_ klasse met attributen voor naam en leeftijd.
//
    private final String bedrijfsnaam;
    private Manager manager;

    public Bedrijf(String bedrijfsnaam) {
        this.bedrijfsnaam = bedrijfsnaam;
    }

    public void hireManager(Manager manager){
        this.manager=manager;
    }

    public void getInfo(){
        String managerNaam;

        if(manager != null){
            managerNaam = manager.getName();
        } else {
            managerNaam = "Dit bedrijf zoekt nog een manager";
        }

        String info = "Bedrijfsnaam: " + bedrijfsnaam +
                "\nManager: " + managerNaam;

        System.out.println(info);
    }


}
