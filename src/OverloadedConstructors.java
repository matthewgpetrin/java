public class OverloadedConstructors {
    public static void main(String[] args) { // Magic words
        // Overloaded Constructors:
        // Overloaded Constructor: Constructor that has the same name as another, but different parameters (different signature)

        Pizza pizza1 = new Pizza("Thin", "Tomato", "Mozzarella", "Pepperoni"); // Creates object of class type
        System.out.println("These are the ingredients of your pizza:");
        System.out.println(pizza1.crust);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);

        Pizza pizza2 = new Pizza("Thin", "Tomato", "Mozzarella"); // Creates object using overloaded constructor
        System.out.println("These are the ingredients of your pizza:");
        System.out.println(pizza2.crust);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.topping); // Returns null because overloaded constructor does not use topping parameter
    }
}

class Pizza {
    String crust;
    String sauce;
    String cheese;
    String topping;

    Pizza(String crust, String sauce, String cheese, String topping) {
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    Pizza(String crust, String sauce, String cheese) { // Overloaded constructor with different signature
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
    }
}

