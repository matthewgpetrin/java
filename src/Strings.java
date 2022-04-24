public class Strings {
    public static void main(String[] args) { // Magic words

        // String Methods:
        String name = "Matthew";

        //boolean result = name.equals("Matthew"); // Checks equality
        //boolean result = name.equalsIgnoreCase("Matthew"); // Checks equality without cases
        //int result = name.length(); // Length of string
        //char result = name.charAt(0); // Character at location index in string
        //String result = name.trim(); // Trims spaces before and after string
        String result = name.replace("a", "o"); // Replaces char with new char

        System.out.println(result);

    }
}
