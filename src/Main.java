public class Main {
    // De main methode is de ingang, de voordeur van je applicatie.
    public static void main(String[] args) {
        // Maak een nieuw ApplePieRecipe.
        ApplePieRecipe applePie = new ApplePieRecipe();
        // Print de ingredienten met de "printIngredients" methode.
        applePie.printIngredients();
        // Print het recept met de "prinRecipe" methode.
        applePie.printRecipe();
    }
}
