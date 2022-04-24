public class Conditionals {
    public static void main(String[] args) { // Magic words

        // If Statements:
        int age = 80;

        if (age >= 75) {
            System.out.println("Ok boomer...");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are a minor.");
        }

        // Switches:
        String day = "Pizza";

        switch (day) {
            case "Sunday":
                System.out.println("It is Sun");
                break;
            case "Monday":
                System.out.println("It is Mon");
                break;
            case "Tuesday":
                System.out.println("It is Tue");
                break;
            case "Wednesday":
                System.out.println("It is Wed");
                break;
            case "Thursday":
                System.out.println("It is Thu");
                break;
            case "Friday":
                System.out.println("It is Fri");
                break;
            case "Saturday":
                System.out.println("It is Sat");
                break;
            default:
                System.out.printf(day + " is not a day");
        }
    }
}
