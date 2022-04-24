public class OverloadedMethods {
    public static void main(String[] args) { // Magic words
        // Overloaded Methods:
        int x = add(1,2);
        int y = add(1,3,5);
        int z = add(6,3,4);
        double a = add(3.4, 5.6);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }

    static int add(int a, int b){
        System.out.println("Overloaded Method 1");
        return a+b;
    }
    static int add(int x, int y, int z){ // Using different parameters changes the method signature and creates a new method
        System.out.println("Overloaded Method 2");
        return x+y+z;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("Overloaded Method 3");
        return a+b+c+d;
    }
    static double add(double a, double b){ // Using different parameter types also changes method signature
        System.out.println("Overload Method 4");
        return a+b;
    }
}
