import java.util.EmptyStackException;

/**
 * The Stack class includes push, pop, empty, and peek methods. If fixed length, should be at least 10
 * and handle subsequent pushes correctly by throwing an exception. Class accepts doubles. Methods
 * should throw an exception if popping from or peeking into an empty stack.
 */
public class Stack {
    private static double[] array;      // Holds stack elements
    private static int top;             // Stack top pointer

    /**
     * Constructor.
     */
    public Stack() {
        final int SIZE = 10;
        array = new double[SIZE];
        top = 0;
    }

    /**
     * The push method pushes a value onto the stack.
     * @param num The number to push onto the stack.
     * @exception StackOverflowError when the stack is full.
     */
    public void push(double num) throws StackOverflowError {

        if (top == array.length)
            throw new StackOverflowError();
        else
        {
            array[top] = num;
            top++;
        }
    }

    /**
     * The pop method pops a value off the stack.
     * @return The number popped.
     * @exception EmptyStackException When the stack is empty.
     */
    public double pop() {
        if (empty())
            throw new EmptyStackException();
        else {
            top--;
            return array[top];
        }
    }

    /**
     * The empty method checks for an empty stack.
     * @return true if stack is empty.
     */
    public boolean empty() {
        return top == 0;        // If top equals zero, then nothing is in the array
    }

    /**
     * The peek method returns the value at the top of the stack.
     * @return number at top of the stack.
     * @exception EmptyStackException When the stack is empty.
     */
    double peek() {
        if (empty())
            throw new EmptyStackException();
        else {
            return array[top - 1];
        }
    }

    /**
     * getSize method
     * @return top Size of stack
     */
    public int getSize() {
        return top;
    }
}
