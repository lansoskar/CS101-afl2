package Interface1;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<FastFood> foodItems = new ArrayList<>();
        Pizza pizza = new Pizza();
        Sandwich sandwich = new Sandwich();
        Durum durum = new Durum();

        foodItems.add(pizza);
        foodItems.add(sandwich);
        foodItems.add(durum);

        for (FastFood a : foodItems) { // foreach loop kører igennem arraylist foodItems og bruger metoden eat
            a.eat();

        }
    }
}
