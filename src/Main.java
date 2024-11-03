import pizzaFact.Ingredient;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Ingredient ingredient1 = new Ingredient();
        ingredient1.setName("Cheese");
        ingredient1.setIngredient_price(100);

        Ingredient ingredient2 = new Ingredient();
        ingredient2.setName("Sausage");
        ingredient2.setIngredient_price(60);

        Ingredient ingredient3 = new Ingredient();
        ingredient3.setName("Mushroom");
        ingredient3.setIngredient_price(40);

        Ingredient ingredient4 = new Ingredient();
        ingredient4.setName("Prawns");
        ingredient4.setIngredient_price(30);

        Ingredient ingredient5 = new Ingredient();
        ingredient5.setName("Cuttle Fish");
        ingredient5.setIngredient_price(80);

        Ingredient ingredient6 = new Ingredient();
        ingredient6.setName("Chicken");
        ingredient6.setIngredient_price(50);

        Ingredient[] ingredients = {ingredient1, ingredient2, ingredient3, ingredient4, ingredient5, ingredient6};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name);




    }
}