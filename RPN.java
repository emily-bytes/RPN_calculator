import java.util.Scanner;

/**
 * Basically, when you see a number, push it onto the stack, and when you see an operator, pop the two operands
 * from the stack and push the result back onto the stack. When you have no more tokens (operands or operators)
 * you should have one number left on the stack which is your final result. If the expression is not a well-formed
 * RPN expression (e.g., 3 2 + +) then throw an error.
 *
 * @author Emily Lee
 * @version 1.0
 */
public class RPN {
    /**
     * The evaluate method reads an expression provided by the user and pushes the numbers into the stack and
     * pops operands from the stack and pushes the result back onto the stack.
     * @return num Result post-calculation
     */
    public static double evaluate(String expression) {
        // Declare variables
        double num;         // To store numbers into stack
        double num1;        // To hold number to pop
        double num2;        // To hold number to pop
        String operator;    // To hold operators

        // Create Stack object
        Stack stack = new Stack();              // Stack containing numbers

        // Pass expression into scanner for reading
        Scanner keyboard = new Scanner(expression);
        while (keyboard.hasNext()) {
            // If the value in expression is a double, assign to "num"
            if (keyboard.hasNextDouble()) {
                num = keyboard.nextDouble();
                stack.push(num);
            }
            // If the value in the expression is an operator, assign to "operator"
            else if (keyboard.hasNext()) {
                operator = keyboard.next();

                // Requires two number in the stack to evaluate
                if (stack.getSize() < 2) {
                    throw new IllegalArgumentException ("Too many operators");
                }

                switch (operator) {
                    case "+" -> {
                        num1 = stack.pop();
                        num2 = stack.pop();
                        stack.push(num1 + num2);
                    }
                    case "-" -> {
                        num1 = stack.pop();
                        num2 = stack.pop();
                        stack.push(num1 - num2);
                    }
                    case "*" -> {
                        num1 = stack.pop();
                        num2 = stack.pop();
                        stack.push(num1 * num2);
                    }
                    case "/" -> {
                        num1 = stack.pop();
                        num2 = stack.pop();
                        stack.push(num1 / num2);
                    }
                    default -> {
                        throw new IllegalArgumentException ("Unknown operators");
                    }
                }
            }
        }
            // Too many numbers
            if (stack.getSize() > 1) {
                throw new IllegalArgumentException ("Not enough operators");
            }
            return stack.pop();         // return result
        }
}
