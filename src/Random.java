public class Random {
    public static void main(String[] args) { // Magic words

        // Random Numbers:
        java.util.Random random = new java.util.Random(); // Creates instance of random class

        int x = random.nextInt();
        System.out.println(x);

        int die = random.nextInt(6) + 1;
        System.out.println(die);

        double y = random.nextDouble(); // Random number between 0 and 1
        System.out.println(y);

        boolean z = random.nextBoolean();
        System.out.println(z); // Random bool
    }
}
