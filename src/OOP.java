public class OOP {
    public static void main(String[] args) { // Magic words
        // Object-Oriented Programming Basics:
        // Objects are instances of a class containing attributes and methods
        Car myCar1 = new Car(); // Instantiates object myCar of class Car
        Car myCar2 = new Car(); // Instantiates object with the same attributes

        System.out.println(myCar1.make); // Returns specified attribute
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

        myCar1.drive(); // Calls specified method
        myCar1.brake();
    }
}

class Car{ // Class containing attributes and methods
    String make = "Chevrolet";
    String model = "Corvette";
    String color = "Blue";
    int year = 2020;
    double price = 50000.00;

    void drive(){
        System.out.println("You drive the car");
    }

    void brake(){
        System.out.println("You step on the brakes");
    }
}
