import javax.swing.*;

public class GUI {
    public static void main(String[] args) { // Magic words

        // GUI:
        String inputName = JOptionPane.showInputDialog("Enter your name:"); // Take string input in pane
        JOptionPane.showMessageDialog(null, "Hello " + inputName); // Shows pan message

        int inputAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: ")); // Parses string input as int
        JOptionPane.showMessageDialog(null, "You are " + inputAge + " years old");

        double inputHeight = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "You are " + inputHeight + " cm tall");
    }
}
