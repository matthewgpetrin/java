public class FormattedStrings {
    public static void main(String[] args) { // Magic words
        // Printf (% [flags] [precision] [width] [conversion]):
        System.out.printf("This is a format string %d %n", 123); // Second argument is inserted at format specifier %

        boolean myBoolean = true;
        char myChar = '$';
        String myString = "Matt";
        int myInt = 20;
        double myDouble = 1000.3;

        // Conversion Characters
        System.out.printf("%b %n", myBoolean); // b conversion character is boolean
        System.out.printf("%c %n", myChar); // c conversion character is character
        System.out.printf("%s %n", myString); // s conversion character is string
        System.out.printf("%d %n", myInt); // d conversion character is decimal or int
        System.out.printf("%f %n", myDouble); // f conversion character is float or double

        // Width
        System.out.printf("Hello %10s %n", myString); // Sets a number of characters to be printed
        System.out.printf("Hello %-10s %n", myString); // Same as above but left justifies text

        // Precision
        System.out.printf("You have this much money: %.2f %n", myDouble); // Limits decimal digits to 2

        // Flags
        System.out.printf("You have this much money: %-20f %n", myDouble); // Left justify
        System.out.printf("You have this much money: %+f %n", myDouble); // Appends a + or - sign
        System.out.printf("You have this much money: %020f %n", myDouble); // 0 pads output
        System.out.printf("You have this much money: %,20f", myDouble); // Groups numbers by commas
    }
}
