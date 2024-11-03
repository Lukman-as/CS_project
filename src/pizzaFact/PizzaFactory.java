package pizzaFact;

import java.util.Arrays;
import java.util.Objects;

public abstract class PizzaFactory {
    public abstract void prepare();
    public abstract void pack();
}

class Pizza extends PizzaFactory{
    private String topping;
    private String pizzaSize;
    private double price;

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public double getPrice() {
        return price;
    }



    @Override
    public void prepare() {
        System.out.println("Preparing your Order");
    }

    @Override
    public void pack() {
        System.out.println("Order is ready");
    }

    public String[] createTopping(String ingredient1, String ingredient2) {
        return new String[]{getTopping(),  ingredient1, ingredient2};
    }
    public double calculateTotalPrice(Ingredient[] ingredients, String[] toppings, String pizzaSize) {
        double totalPrice = 0;
        for (Ingredient ingredient : ingredients) {
            for (String topping : toppings) {
                if (topping.equals(ingredient.getName())) {
                    totalPrice += ingredient.getIngredient_price();
                }
            }
        }
        if (pizzaSize.equals( "Large")){
            totalPrice += 800;
        } else if (pizzaSize.equals( "Medium")) {
            totalPrice += 500;
        } else if (pizzaSize.equals( "Small")) {
            totalPrice += 350;
        }

        return totalPrice;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void displayOrderDetails(){
        System.out.println("Topping: " + getTopping());
        System.out.println("Size: " + getPizzaSize());
        System.out.println("Total Price: " + getPrice());
    }
}

class cheesePizza extends Pizza{


    public void 
}