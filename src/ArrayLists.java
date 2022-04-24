import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) { // Magic words

        // Array Lists:
        ArrayList<String> food = new ArrayList<String>(); // Creates array list as an object - Uses reference types

        food.add("pizza"); // Adds data to array
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi"); // Sets array element to specified value
        food.remove(2); // Removes index
        food.clear();

        for (int i = 0; i < food.size(); i++) { // Uses .size instead of .length
            System.out.println(food.get(i)); // Gets value at index
        }

        // 2D Array Lists:
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("soda");
        drinkList.add("coffee");

        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList);
    }
}
