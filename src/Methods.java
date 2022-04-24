public class Methods {
    public static void main(String[] args) { // Magic words

        // Methods (just a stupid name for functions):
        String name = "Matt";
        int age = 21;
        hello(name,age); // Arguments being passed to method

        int x = 3;
        int y = 4;
        int z = add(x,y); // Calls method and sets z equal to the return value
        System.out.println(z);
        System.out.println(add(x,y)); // Prints return value of function
    }

    static void hello(String name, int age){ // Parameters match passed arguments
        System.out.println("Hello "+name+"!");
        System.out.println("You are "+age+" years old");
    }

    static int add(int x, int y){
        return x+y; // Must return type int because method is of type int
    }
}
