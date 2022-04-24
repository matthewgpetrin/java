public class Constructors {
    public static void main(String[] args) { // Magic words
        // Constructors:
        // Constructor: A special method called whenever an object is instantiated
        Human human1 = new Human("Matt", 20, 74); // Instantiates object and passes parameters to constructor
        Human human2 = new Human("Bob", 67, 50); // Instantiates object and passes new parameters

        System.out.println(human1.name); // Returns class attribute, which is equal to constructor parameter
        System.out.println(human2.name);

        human1.eat(); // Calls class function using object's specified parameters
        human2.drink();
    }
}

class Human {
    String name; // Declares class attribute - Distinct from constructor parameter
    int age;
    double weight;

    Human(String name, int age, double weight) { // Constructor
        this.name = name; // Equates class attribute to constructor parameter
        this.age = age; // "this" keyword references attribute defined in the class
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is drinking");
    }
}
