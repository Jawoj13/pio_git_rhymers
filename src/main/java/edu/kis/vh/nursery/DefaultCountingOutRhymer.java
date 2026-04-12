package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int max_size = 12;
    public static final int default_value = -1;
    private final int[] numbers = new int[max_size];

    public int total = default_value;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == default_value;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return default_value;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return default_value;
                        return numbers[total--];
                    }

}
