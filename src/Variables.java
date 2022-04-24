public class Variables {
    public static void main(String[] args) { // Magic words

        // Printing strings:
        System.out.print("Sussy soing spingey!\n"); // Print string with new line character
        System.out.println("Deetz nuts"); // Print line also adds new line character

        // Variables:
        int x; // Declaration
        x = 123; // Assignment
        int y = 123; // Initialization

        System.out.println(x); // Prints value of x
        System.out.println("My number is: " + x); // Prints string and value

        long z = 123387632312L; // Init a long
        float a = 123.123f; // Init a float
        double b = 123.123123; // Init a double
        boolean c = true; // Init a bool

        char character = '@'; // Init a char
        String string = "Matthew"; // Init a string. Uses a capital letter as a reference variable

        // Expressions:
        // Expression = operators + operands
        int friends = 10;
        friends = friends + 1;
        friends = friends - 1;
        friends = friends * 2;
        friends = friends / 2; // Ints will be truncated if decimals exist
        friends = friends % 2;
        friends++;
        friends--;

        double bros = 10;
        bros = (int) bros / 3; // Casts result to int

        System.out.println(friends);
        System.out.println(bros);

    }
}