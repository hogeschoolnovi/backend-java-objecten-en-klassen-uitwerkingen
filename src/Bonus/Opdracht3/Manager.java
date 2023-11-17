package Bonus.Opdracht3;

public class Manager {
    private final String name;
    private int age;

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        if(age<40){
            return age;
        } else {
            return age - 3;
        }
    }

}
