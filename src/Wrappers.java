public class Wrappers {
    public static void main(String[] args) { // Magic words
        // Wrappers:
        Boolean a = true; // Autoboxing - primitive value -> reference data type
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Matthew";

        if (b == '@') { // Unboxing - reference data type -> primitive data type
            System.out.println("Unboxed");
        }
    }
}
