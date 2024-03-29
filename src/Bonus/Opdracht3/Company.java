package Bonus.Opdracht3;

public class Company {

    private final String companyName;
    private Manager manager;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void hireManager(Manager manager){
        this.manager=manager;
    }

    public void getInfo(){
        String managerName;

        if(manager != null){
            managerName = manager.getName();
        } else {
            managerName = "Dit bedrijf zoekt nog een manager";
        }

        String info = "Bedrijfsnaam: " + companyName +
                "\nManager: " + managerName;

        System.out.println(info);
    }


}
