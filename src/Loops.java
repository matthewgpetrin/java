import java.util.ArrayList;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) { // Magic words

        // While Loops:
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) { // While loop executes while condition met - Do loop always executes once
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);

        // For Loops:
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        // Nested Loops
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Rows: ");
        rows = scanner.nextInt();
        System.out.println("Columns: ");
        columns = scanner.nextInt();
        System.out.println("Symbol :");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.println(symbol + " ");
            }
        }

        // For Each Loops:
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String i : animals) { // Iterates through elements in array or collection
            System.out.println(i);
        }
    }
}
