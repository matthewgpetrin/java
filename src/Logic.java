import java.util.Scanner;

public class Logic {
    public static void main(String[] args) { // Magic words

        // Logical Operators:
        int temp = 25;

        if (temp < 32) {
            System.out.println("It is freezing");
        } else if (temp > 32 && temp < 212) { // AND operator
            System.out.println("It is warm");
        } else {
            System.out.println("It is boiling");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) { // OR operator - response.equals is == for strings
            System.out.println("You quit the game");
        } else if (!response.equals("q") && !response.equals("Q")) { // NOT operator
            System.out.println("You are still playing the game");
        }
    }
}
