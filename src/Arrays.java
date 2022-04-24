public class Arrays {
    public static void main(String[] args) { // Magic words

        // Arrays
        String[] cars = {"Tesla", "Toyota", "Hyundai"}; // [] creates an array

        cars[0] = "Mustang"; // Array begins at index 0
        System.out.println(cars[0]);

        String[] trucks = new String[3]; // Creates empty array of specific length
        trucks[0] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // Multidimensional Arrays (Matrices)
        String[][] bros = new String[3][3];
        String[][] alternate = {{"", "", ""}, {"", "", ""}, {"", "", ""}};

        bros[0][0] = "Drew";
        bros[0][1] = "Ethan";
        bros[0][2] = "Michael";
        bros[1][0] = "Alex";

        for (int i = 0; i < bros.length; i++) {
            System.out.println();
            for (int j = 0; j < bros[i].length; j++) {
                System.out.print(bros[i][j] + " ");
            }
        }
    }
}
