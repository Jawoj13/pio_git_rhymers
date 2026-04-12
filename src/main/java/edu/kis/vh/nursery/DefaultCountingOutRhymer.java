package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int max_size = 12;
    private static final int default_value = -1;
    private final int[] numbers = new int[max_size];

    private int total = default_value;

    public int getTotal() {
        return total;
    }

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    

        protected boolean callCheck() {
            return total == default_value;
        }
        
            protected boolean isFull() {
                return total == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return default_value;
                    return numbers[total];
                }
            
                    protected int countOut() {
                        if (callCheck())
                            return default_value;
                        return numbers[total--];
                    }

}
