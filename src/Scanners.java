import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) { // Magic words

        // User Input:
        Scanner scanner = new Scanner(System.in); // Creates scanner allowing input

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clears scanner since nextInt does not clear newline character
        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your favorite food is " + food);
    }
}
