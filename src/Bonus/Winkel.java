package Bonus;

public class Winkel {
    private final String cola = "cola";
    private final String candles = "candles";
    private int colaAmount = 0;
    private int candlesAmount = 0;

    public void addCola(int amount){
        colaAmount += amount;
    }

    public void addCandles(int amount){
        candlesAmount += amount;
    }

    // alternatief om herhaling te voorkomen (DRY)
    public void addSomething(String something, int amount){
        switch (something){
            case cola -> colaAmount += amount;
            case candles -> candlesAmount += amount;
            default -> System.out.println("We verkopen geen " + something);
        }
    }

    public void printStock(){
        String info = cola + ": " + colaAmount + "\n" +
                candles + ": " + candlesAmount + "\n";
        System.out.println(info);
    }
}
