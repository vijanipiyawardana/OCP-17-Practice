public class Demo {

    /**
     * 5. IllegalArgumentException
     * 
     * a way for your program to protect itself. You want to
     * tell the caller that something is wrong—­preferably in an obvious way that
     * the caller can’t ignore so the programmer will fix the problem.
     * 
     * Exception in thread "main" java.lang.IllegalArgumentException: # eggs must
     * not be negative
     * 
     */
    int numberEggs = 0;

    public static void main(String[] args) {
        // new Demo().setNumberEggs(-2);

        /**
         * 
         * 6. NumberFormatException ==========================
         * 
         * Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
         * NumberFormatException is a subclass of IllegalArgumentException
         * 
         */
        Integer.parseInt("abc");
        /*
         * ===================================================
         */

    }

    public void setNumberEggs(int numberEggs) {
        if (numberEggs < 0) {
            throw new IllegalArgumentException("# eggs must not be negative");
        }
        this.numberEggs = numberEggs;
    }

}
