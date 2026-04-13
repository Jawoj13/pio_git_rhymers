package edu.kis.vh.nursery;

/**
 * Base Class for Rhymers
 *implementing stack structure
 */
public class DefaultCountingOutRhymer {

    private static final int max_size = 12;
    private static final int default_value = -1;
    private final int[] numbers = new int[max_size];

    private int total = default_value;

    /**
     * Returns total number of stack elements, -1 if empty
     */
    public int getTotal() {
        return total;
    }

    /**
     * Adds element to top of stack
     * @param in
     * element to be added to stack
     */
    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     *
     * @return
     * True if empty, False otherwise
     */
    protected boolean callCheck() {
            return total == default_value;
        }

    /**
     *
     * @return
     * True if full, False otherwise
     */
    protected boolean isFull() {
                return total == 11;
            }

    /**
     * Like a pop without removing element from stack
     * @return
     * Top stack element or -1 if empty
     */
    protected int peekaboo() {
                    if (callCheck())
                        return default_value;
                    return numbers[total];
                }

    /**
     * Pop method
     * @return
     * Top element from stack
     */
    protected int countOut() {
                        if (callCheck())
                            return default_value;
                        return numbers[total--];
                    }

}
