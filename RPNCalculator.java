import java.util.Scanner;

/**
 * This program allows the user to type in an expression, then evaluates it, and repeats it until they say quit.
 * @author Emily Lee
 * @version 1.0
 */
public class RPNCalculator {

    /**
     * The main method allows a user to type in an expression, evaluates it, and repeats it until they hit "enter"
     * to quit.
     * @param args Array of command line arguments
     */
    public static void main(String[] args) {
        // Declare variables
        String expression;      // To hold expression
        double num;             // To store double number

        // Display welcome message
        System.out.print("RPN Calculator\n");
        System.out.println("(blank line to quit)");

        do {
            // Open scanner object
            Scanner keyboard = new Scanner(System.in);

            // Prompt user for an expression
            System.out.print("calc> ");
            expression = keyboard.nextLine();

            if (expression.equals("")) {
                // Display goodbye message if user hits "enter"
                System.out.print("\nBye!");;
            }
            else
                System.out.println(RPN.evaluate(expression));       // else, evaluate expression using RPN calculator

        } while (!expression.equals(""));
    }
}
