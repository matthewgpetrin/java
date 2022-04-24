import java.util.Random;

public class VariableScopes {
    public static void main(String[] args) { // Magic words
        // Local and Global Variables:
        // Local: Declared within a method - Visible only to the method
        // Global: Declared outside a method but within a class - Visible to the whole class

        DiceRoller1 diceRoller1 = new DiceRoller1();
        DiceRoller2 diceRoller2 = new DiceRoller2();
    }
}

class DiceRoller1 { // Using local variables
    DiceRoller1() {
        int number = 0; // Creates local variable - Is only visible to code within the method
        Random random = new Random();
        roll(random, number);  // Method is called locally so it can reference local variables
    }

    void roll(Random random, int number) {
        number = random.nextInt(6 + 1);
        System.out.println(number);
    }
}

class DiceRoller2 { // Using global variables
    int number; // Declares global variable
    Random random;

    DiceRoller2() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6 + 1);
        System.out.println(number);
    }
}