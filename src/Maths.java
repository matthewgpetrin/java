import java.util.Scanner;

public class Maths {
    public static void main(String[] args) { // Magic words

        // Math Methods:
        double x = 3.14;
        double y = -10;

        double a = Math.max(x, y); // Finds larger of 2 doubles
        double b = Math.min(x, y);
        double c = Math.abs(y);
        double d = Math.sqrt(x);
        double e = Math.round(x);
        double f = Math.ceil(x); // Rounds up
        double g = Math.pow(x, 3); // x to the power of 3
        System.out.println(a);

        // Hypotenuse:
        double length;
        double width;
        double hypotenuse;

        Scanner scanner = new Scanner(System.in); // Creates scanner named scanner with input system

        System.out.println("Enter side x: ");
        length = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter side y: ");
        width = scanner.nextDouble();
        scanner.nextLine();

        hypotenuse = Math.sqrt((length * length) + (width * width));
        System.out.println("The hypotenuse is: " + hypotenuse);

        scanner.close(); // Closes scanner
    }
}
