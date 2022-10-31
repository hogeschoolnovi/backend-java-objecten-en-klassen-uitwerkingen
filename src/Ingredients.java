public class Ingredients {


    // We definieren hier 3 "class variables", maar we geven ze nog geen waarde.
    // Deze variablen zijn "private", dus je kunt ze niet buiten deze klasse gebruiken.
    private double amount;
    private String unit;
    private String name;

    // Deze "lege" constructor maken we aan, maar gebruiken we niet. Normaal maakt java die automatisch, achter de schermen aan,
    // maar omdat wij in deze klasse ook een andere constructor hebben gemaakt, doet java het niet meer automatisch.
    // We moeten dus zelf deze "lege" constructor er bij maken.
    public Ingredients() {
    }

    // In deze constructor vragen we 3 parameters.
    public Ingredients(double amount, String unit, String name) {
        // De 3 parameters gebruiken we om de 3 class variables hierboven een waarde te geven.
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    // We definieren hier zogenaamde "getters en setters". Dit zijn methodes om private class variables toch toegankelijk te maken buiten de klasse.
    // We gebruiken deze "getters" om de waardes in de printIngredients-methode van ApplPieRecipe-klasse uit te printen.
    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setName(String name) {
        this.name = name;
    }
}
